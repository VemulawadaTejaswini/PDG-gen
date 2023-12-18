
import java.util.*;
public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int [] data = new int[n];
			for(int i = 0; i < n; i++){
				data[i] = sc.nextInt();
			
			}
			Arrays.sort(data);
			int [] data2 = new int[n];
			int sum = 0;
			data2[0] = 0;
			for(int i = 1; i < n; i++){
				data2[i] = data2[i-1] + data[i-1];
			}
			
			for(int i = 0; i < n; i++){
				sum += data2[i];
			}
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}