import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int ct = 0;
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		String[] str = S.split("");
		for(int i = 0; i < str.length; i++) {
			for(int k = 0; k < str.length; k++) {
				if(i == k) continue;
				if(str[i].equals(str[k]) == true) ct++;
			}
		}
		if(ct == 0) System.out.println("yes");
		else System.out.println("no");
		scan.close();
	}
}
