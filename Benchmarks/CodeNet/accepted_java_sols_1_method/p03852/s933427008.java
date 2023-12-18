import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] a= {"a","e","i","o","u"};
		String c=sc.next();
		String ans="consonant";
		for(int i=0;i<5;i++) {
			if(c.equals(a[i])) {
				ans="vowel";
				break;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
