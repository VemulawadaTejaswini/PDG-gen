import java.util.*;

public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int D = sc.nextInt();
		int count = 0;
		for(int i = 0;i < N;i++) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			if(Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2))<= D) {
				count++;
			}
		}
		System.out.println(count);
	}
}