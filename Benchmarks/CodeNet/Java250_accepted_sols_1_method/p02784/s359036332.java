import java.util.*;

public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int N = sc.nextInt();
		int total = 0;
		for(int i = 0;i < N;i++) {
			int A = sc.nextInt();
			total += A;
		}
		if(total >= H) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}