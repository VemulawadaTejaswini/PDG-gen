import java.util.*;
 
public class Main {
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		long count = 0;
		long save = 0;
		long reset = 0;
		for (int i = 0; i < N; i++) {
			int Ti = sc.nextInt();
			if (count < Ti-reset) {
				save += count;
				reset = Ti;
				count = T;
			} else {
				count = Ti+T-reset;
			}		
		}
		System.out.println(count+save);
	}
}