
import java.util.*;
public class Main {
	//1100 start
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int w = sc.nextInt();
			if((w|n) == 0) break;
			int [] data = new int[11];
			for(int i = 0; i < n; i++){
				int v = sc.nextInt();
				data[v / w]++;
			}
			
			for(int i = data.length -1; i >= 0; i--){
				if(data[i] > 0){
					n = i + 1;
					break;
				}
			}
			int max = 0;
			for(int i = 0; i < n; i++){
				max = Math.max(max, data[i]);
			}
			
			double sum = 0.01;
			for(int i = 0 ; i< n; i++){
				double value;
				if(n == 1){
					value = (double)data[i] / max;
				}
				else{
					value = (double)data[i] / max * ((double)(n-1 - i) / (n - 1)) ;
				}
				//System.out.println("value = " + value + " n= " + n);
				sum += value;
			}
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}