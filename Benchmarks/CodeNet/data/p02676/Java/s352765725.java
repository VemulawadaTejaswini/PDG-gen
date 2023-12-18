import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int K=scan.nextInt();
		String S=scan.next();
		if(S.length()<=K) {
			System.out.print(S);
		}
		else {
			for(int i=0;i<K;i++)
				System.out.print(S.charAt(i));
			System.out.print("...");
		}
	}

}
