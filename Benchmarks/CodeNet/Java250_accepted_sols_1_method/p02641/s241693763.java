import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X			= sc.nextInt();
		int N			= sc.nextInt();
		Integer nList[]	= new Integer[N];
		for(int i = 0; i < N; i++) {
			nList[i]	= sc.nextInt();
		}
		int ans			= X;
		Boolean flag	= true;
		for (int i = 0; i <= X && flag; i++) {
			if(!(Arrays.asList(nList).contains(X-i))) {
				ans = X-i;
				flag = false;
			}
			else if(!(Arrays.asList(nList).contains(X+i))) {
				ans =X+i;
				flag = false;
			}
		}
		System.out.println(ans);
	}
}