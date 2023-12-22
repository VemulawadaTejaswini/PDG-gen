import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum = 0;
		
		for (int i = 0; i < m; i++){
			sum = sum + sc.nextInt();
		}

		int free = n - sum;
		if (free < 0) free = -1;
			
		System.out.println(free);
	}
}