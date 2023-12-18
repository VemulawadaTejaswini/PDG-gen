package jp.tuyano.eclipsebook;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for(;;){
			int N = in.nextInt(), M = in.nextInt();
			if(N==0 && M==0){
				return ;
			}
			int[] as = new int[N];
			for(int i=0; i<N; i++){
				as[i] = in.nextInt();
			}
			
			int mini = Integer.MAX_VALUE, key = Integer.MAX_VALUE, ans = -1;
			boolean hope = false;
			
			for(int i=0; i<N; i++){
				ArrayList<Integer> ts = new ArrayList<Integer>();
				for(int j=0; j<=M; j+=as[i]){
					ts.add(j);
				}
				
				ArrayList<Integer> escapes = new ArrayList<Integer>();
				for(int j=0; j<ts.size(); j++){
					int time = ts.get(j);
					if(time > mini || (time == mini && as[i] >= key) ){
						escapes.add(time);
					}
				}
				
				if(!escapes.isEmpty()){
					int time = escapes.get(0);
					if(time == mini && as[i] == key){
						hope = true;
					}
				}
				else{
					hope = false;
					mini = ts.get(ts.size() - 1);
					key = as[i];
					ans = i;
				}
			
			}
			
			if(hope){
				System.out.println(N);
			}
			else{
				System.out.println(ans + 1);
			}
		}
	}

}