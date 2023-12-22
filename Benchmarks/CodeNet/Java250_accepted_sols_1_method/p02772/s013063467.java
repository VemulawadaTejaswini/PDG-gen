import java.util.*;

public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count1 = 0;
		int count2 = 0;
		for(int i = 0;i < N;i++) {
			int A = sc.nextInt();
			if(A % 2 == 0) {
				if(A % 3 == 0 || A % 5 == 0) {
					count1++;
				}else {
					count2++;
				}
			}
		}
		if(count2 > 0) {
			System.out.println("DENIED");
		}else {
			System.out.println("APPROVED");
		}
	}
}