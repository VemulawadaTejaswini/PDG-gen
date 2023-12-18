
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        for(int i=0;i<s.length;i++)s[i]=(char)((s[i]-'A'+23)%26+'A');
        System.out.println(s);
	}
}
