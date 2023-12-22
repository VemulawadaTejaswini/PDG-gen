import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []h = new int [n+1];
		
		for(int i = 0; i < n ; i++) {
			h[i] = sc.nextInt();
		}
		int r , l;
		int count = 0;
		do {
			r = 0; l = 0;
			int flag = 0;
			for(int i = 0; i <= n ; i++) {
				if(h[i] > 0 && flag == 0) {
					flag = 1;
					count++;					
					r = i;
				}
				if(h[i] == 0 && flag == 1) {
					flag = 0; 
					l = i;
					break;
				}
			}
			
			for(int i = r; i < l ; i++) {
				h[i] = h[i] - 1;
			}
			
		}while(r != 0 || l != 0);
		
		System.out.println(count);
	} 		
}


