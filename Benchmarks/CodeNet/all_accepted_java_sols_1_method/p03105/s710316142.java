import java.util.Scanner;
public class Main {
	static int A,B,C;
	//static String ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A=sc.nextInt();
		B=sc.nextInt();
		C=sc.nextInt();
		int i=0;
		for(;i<C;i++) {
			B-=A;
			if(B<0)break;
		}
		System.out.println(i);
	}
}