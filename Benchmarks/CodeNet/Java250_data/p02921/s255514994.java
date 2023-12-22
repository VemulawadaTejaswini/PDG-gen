import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		String[] s = S.split("");
		String[] t = T.split("");
		int count = 0;
		for(int i=0;i<s.length;i++) {
			if(s[i].equals(t[i])) {
				count++;
			}
		}
		System.out.println(count);
	}
}