import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B =sc.nextInt();
		if (A==2||B==2) {
			System.out.println("No");
			return ;
		}
		int a[]= {4,6,9,11};
		int indexa ,indexb;
		for (indexa=0;indexa<a.length;indexa++) {
			if (a[indexa]==A) {
				break;
			}
		}
		for (indexb=0;indexb<a.length;indexb++) {
			if (a[indexb]==B) {
				break;
			}
		}
		if (indexa>=4&&indexb>=4) {
			System.out.println("Yes");
			return ;
		}
		if (indexa<4&&indexb<4) {
			System.out.println("Yes");
			return ;
		}
		System.out.println("No");
	}
}