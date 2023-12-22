
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();
		String T = sc.nextLine();
		String[] Ss = S.split("");
		String[] Ts = T.split("");

		int count = 0;
		for(int i = 0; i < Ss.length; i++) {
			if(!Ss[i].equals(Ts[i])) {
				count++;
			}
		}

		System.out.println(count);
	}


}
