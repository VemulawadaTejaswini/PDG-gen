
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int [][]L = new int [n][2];
		
		for(int i = 0 ; i < n ;i++) {
			int a = Integer.parseInt(sc.next());
			int k = Integer.parseInt(sc.next());
			L[i][0] = a - k;
			L[i][1] = a + k;
		}
		
		Arrays.sort(L,(x,y) -> Integer.compare(x[1],y[1]));
		
		long now = L[0][1];
		int cnt = 1;
		boolean exsit = true;
		int j = 1;
		
	f:	while(exsit){
			
			for(int i = j ; i < n ;i++) {
				if(now <= L[i][0]) {
					now = L[i][1];
					j = i;
					cnt++;
					continue f;
				}
			}
			exsit = false;
		}
		
		System.out.println(cnt);
	}

}
