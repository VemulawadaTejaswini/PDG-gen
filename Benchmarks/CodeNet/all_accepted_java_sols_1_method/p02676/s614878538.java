import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int K=scan.nextInt();
		String S=scan.next();
		int S_length=S.length();
		if(K<S_length) {
			for(int i=0;i<K;i++) {
				System.out.print(S.charAt(i));
			}
			System.out.print("...");
		}
		else {
			System.out.print(S);
		}

	}

}