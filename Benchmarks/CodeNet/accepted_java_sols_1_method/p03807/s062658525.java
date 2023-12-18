import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			String in2 = br.readLine();
			ArrayList<Integer> oddList = new ArrayList<Integer>();
			ArrayList<Integer> evenList = new ArrayList<Integer>();
			for(String str:in2.split(" ")){
				int i = Integer.parseInt(str);
				if(i%2 == 0){
					evenList.add(i);
				}else{
					oddList.add(i);
				}
			}

			while(true){
				if(oddList.size() > 1){
					int i = oddList.get(0) + oddList.get(1);
					oddList.remove(1);
					oddList.remove(0);
					if( i%2 == 0 ){
						evenList.add(i);
					}else{
						oddList.add(i);
					}
				}else if(evenList.size() > 1){
					int i = evenList.get(0) + evenList.get(1);
					evenList.remove(1);
					evenList.remove(0);
					if( i%2 == 0 ){
						evenList.add(i);
					}else{
						oddList.add(i);
					}
				}else{
					int i = evenList.size() + oddList.size();
					if(i == 1){
						System.out.println("YES");
					}else{
						System.out.println("NO");
					}
					break;
				}
			}
		}catch( Exception e ){

		}
	}

}
