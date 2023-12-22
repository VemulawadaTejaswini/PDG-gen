import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		int n = N;
		for(int i = 0; i < N;i++) {
			if(n >= 3) {
				n = n-3;
				count++;
			}else {
				break;
			}
		}
		System.out.println(count);
	}
}