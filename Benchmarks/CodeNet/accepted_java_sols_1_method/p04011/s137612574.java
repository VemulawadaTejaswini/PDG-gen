import java.util.*;
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
		int N = sc.nextInt();
		int K = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int total = 0;
		for (int i = 1; i <= N; i++) {
			total += (i <= K)?X:Y;
		}
		System.out.println(total);
	}
}