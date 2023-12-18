import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = S.length();
		int hantei1=((N-1)/2);
		int hantei2=((N+3)/2)-1;
		String a1 = S.substring(0, hantei1);
		String a2 = S.substring(hantei2, N);
		
		if(a1.equals(a2)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

		sc.close();
	}
}