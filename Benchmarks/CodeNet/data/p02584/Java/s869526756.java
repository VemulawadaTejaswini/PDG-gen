import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int K = sc.nextInt();
		int D = sc.nextInt();
		int min = 0;
		
		for(int i = 1; i <= K; i++) {
			if(X > 0) {
				X -= D;
			}else {
				X += D;
			}
		}
		System.out.println(Math.abs(X));
		
	}
}