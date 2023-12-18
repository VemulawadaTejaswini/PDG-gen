import java.util.*;

public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int p = sc.nextInt();
			if((n|m|p) == 0) break;
			int sum = 0;
			int data = -1;
			for(int i = 0; i < n; i++){
				int now = sc.nextInt();
				if(i == m - 1){
					data = now;
				}
				sum+= now;
			}
			
			sum = sum * (100 - p);
			System.out.println(data == 0 ? 0 : sum / data);
		}
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}