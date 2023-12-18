import java.util.*;

public class Main{
	public static void main(String[] args) {
		String i,o;
		Scanner sc = new Scanner(System.in);
		i = sc.nextLine();
		o = "";
		sc.close();
		
		int j;
		for (j=0 ; j<i.length() ; j++) {
			char a;
			a = i.charAt(j);
			if (a>='A' && a<='Z') {
				a += 'a'-'A';
			}else if (a>='a' && a<='z') {
				a += 'A'-'a';
			}
			o = o+a;
		}
		System.out.println(o);
	}
}
