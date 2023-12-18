import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
			int[] a = new int[3];
			for(int i=0 ; i<3 ; i++) {
				a[i] = stdIn.nextInt();
			}
			if(a[0]==a[1]&&a[1] == a[2]||a[0]!=a[1]&&a[1]!=a[2]&&a[2]!=a[0]) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
	}
}
