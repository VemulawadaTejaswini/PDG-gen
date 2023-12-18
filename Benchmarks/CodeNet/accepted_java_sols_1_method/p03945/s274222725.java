import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String[] s = S.split("");
		int count = 0;
		for(int i=1; i<s.length; i++) {
		    if(s[i].equals(s[i-1])) {
		        continue;
		    }else {
		        count++;
		    }
		}
		System.out.println(count);
	}
}