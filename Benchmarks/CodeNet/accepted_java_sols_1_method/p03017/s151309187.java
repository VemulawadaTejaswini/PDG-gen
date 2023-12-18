import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int D=sc.nextInt();
		String S=sc.next();
		Boolean can=true;Boolean nuku=false;
		char a1='#',a2='#',a3='.';
		int max=Math.max(C, D);
		int min=Math.min(C, D);

		for(int i=A-1;i<max;i++) {
			a1=a2;
			a2=a3;
			a3=S.charAt(i);
			if(a2=='#'&&a3=='#') {
				System.out.println("No");
				return;
			}
			if(a1=='.'&&a2=='.'&&a3=='.'&&i>=B&&i<=min) {
				nuku=true;
			}
		}
		if(C<D) {
			System.out.println("Yes");
			return;
		}
		if(nuku) {
			System.out.println("Yes");
		}else {
			System.out.print("No");
		}
	}

}
