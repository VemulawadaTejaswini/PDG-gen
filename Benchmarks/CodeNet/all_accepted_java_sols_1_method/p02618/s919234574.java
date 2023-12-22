
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int d = Integer.parseInt(sc.next());
		
		int []c = new int [26];
		int [][]s = new int [d][26];
		
		for(int i = 0 ; i < 26 ;i++) {
			c[i] = Integer.parseInt(sc.next());
		}
		
		for(int i = 0; i < d ;i++) {
			for(int j = 0 ; j < 26  ; j++) {
				s[i][j] = Integer.parseInt(sc.next());
			}
		}
		int []p = new int [d];
		
		for(int i = 0 ;i < d ;i++) {
			int max = 0;
			int id = 0;
			for(int j = 0 ; j < 26 ;j++) {
				if(max < s[i][j]) {
					max = s[i][j];
					id = j+1;
				}
			}
			p[i] = id;
		}
		
		for(int i = 0 ; i < d ; i++) {
			System.out.println(p[i]);
		}
	}

}
