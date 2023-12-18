import java.util.*;
import java.awt.geom.*;

public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int k = sc.nextInt();
			if((n|k) == 0)break;
			int [] data = new int[k];
			for(int i = 0; i < k; i++){
				data[i] = sc.nextInt();
			}
			Arrays.sort(data);
			ArrayList<Integer> notexist = new ArrayList<Integer>();
			notexist.add(0);
			int prev = data[0];
			for(int i = 1; i < k; i++){
				if(prev + 1 != data[i]){
					for(int j = prev + 1; j <= data[i] - 1; j++){
						notexist.add(j);
					}
				}
				prev = data[i];
			}
			notexist.add(data[k-1] + 1);
			if(data[0] == 0){
				if(notexist.size() == 2){
					System.out.println(notexist.get(1) - notexist.get(0));
					continue;
				}
				prev = 0;
				int max = 0;
				for(int i = 2; i < notexist.size(); i++){
					int value = notexist.get(i) - prev - 1;
					max = Math.max(max, value);
					prev = notexist.get(i-1);
				}
				System.out.println(max);
			}
			else{
				prev = 0;
				int max = 0;
				for(int i = 1; i < notexist.size(); i++){
					int value = notexist.get(i) - prev - 1;
					max = Math.max(max, value);
					prev = notexist.get(i);
				}
				System.out.println(max);
			}
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}