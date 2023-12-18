import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	Scanner sc;

	Main() {
		sc = new Scanner(System.in);
	}
	

	public void run() {
		for (;;) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int data[][] = new int[n][2];
			
			
			for(int i = 0; i < n ; i++){
				int a = sc.nextInt()-1;
				int b = sc.nextInt()-1;
				data[i][0] = Math.max(a, b);
				data[i][1] = Math.min(a, b);
			}
			
			int ans = 0;
			for(int i = 0 ; i < n ;i++){
				for(int j = i ; j < n ; j++){
					for(int k = 0 ; k < 2; k++){
						if(data[j][k] == i){
							ans += j-i;
							data[j][1] = data[j][1-k];
							for(int z = j-1; z >= i ; z--){
								data[z+1][0] = data[z][0];
							}
							data[i][0] = i;
							for(int z = i; z <= j ; z++){
								int a = data[z][0];
								int b = data[z][1];
								data[z][0] = Math.max(a, b);
								data[z][1] = Math.min(a, b);
							}
//							System.out.println(Arrays.deepToString(data) + " "+ ans);
						}						
					}
				}
			}
//			System.out.println(Arrays.deepToString(data));
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

}