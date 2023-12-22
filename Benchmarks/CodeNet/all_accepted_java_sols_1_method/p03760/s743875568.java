import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String O = sc.next();
		String E =sc.next();
		char [] o = O.toCharArray();
		char [] e = E.toCharArray();
		for(int i=0;i<o.length;i++) {
			System.out.print(o[i]);
			if(o.length!=e.length && i==o.length-1)break;
			System.out.print(e[i]);
		}
		sc.close();
	}
}