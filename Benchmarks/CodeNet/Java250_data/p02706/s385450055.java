import java.util.*;
 
public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int M = sc.nextInt();
		int total = 0;
		for(int i = 0;i < M;i++) {
			int x = sc.nextInt();
			total += x;
		}
		if(N - total < -1) {
			System.out.println("-1");
		}else {
			System.out.println(N - total);
		}
	}
}