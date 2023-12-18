import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		String s = "No";
		for(int i=0; i<X; i++) {
			int j = X-i-1;
				if(X==1) {
					if(Y==2 || Y==4) {
						s = "Yes";
					}
				}else {
					if((i+1)*2 + (j)*4 == Y) {
						s = "Yes";
					}
				}
		}
		sc.close();
		System.out.println(s);
	}

}