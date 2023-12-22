import java.util.Scanner;

public class Main {
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			String[] S = sc.next().split("");
			String[] T = sc.next().split("");
			sc.close();
			if (S.length + 1 == T.length) {
				for (int i = 0; i < S.length; i++) {
					if (! S[i].equals(T[i])){
						System.out.println("No");
						return;
					}
				}
				System.out.println("Yes");
				return;
			}
			System.out.println("No");
    }
}
