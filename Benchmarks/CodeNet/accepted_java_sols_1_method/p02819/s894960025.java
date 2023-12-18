import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X=sc.nextInt();
		if(X==1||X==2) {
			System.out.println(2);
		}else {
		for(int i=X;;i++) {
			for(int j=2;j<X;j++) {
				if(i%j==0) {
					break;
				}
				if(j==X-1) {
					System.out.println(i);
					System.exit(0);
				}
			}
		}}

}}
