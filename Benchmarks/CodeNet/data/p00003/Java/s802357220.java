import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int N = scan.nextInt();
		for(int i = 0; i < N; i++){
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			if(a * a == b * b + c * c | b * b == a * a + c * c | c * c == a * a + b * b){
				System.out.println("YES");
			} else{
				System.out.println("NO");
			}
		}
	}
}