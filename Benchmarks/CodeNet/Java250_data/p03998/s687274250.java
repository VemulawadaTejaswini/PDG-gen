import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.next();
		String[] ac = a.split("");
		List<String> Ac = Arrays.asList(ac);
		String b = s.next();
		String[] bc = b.split("");
		List<String> Bc = Arrays.asList(bc);
		String c = s.next();
		String[] cc = c.split("");
		List<String> Cc = Arrays.asList(cc);
		Iterator ai = Ac.iterator();
		Iterator bi =Bc.iterator();
		Iterator ci = Cc.iterator();
		
		System.out.println(keisan(Ac, Bc, Cc, ai, bi, ci, "a"));
	}
	static char keisan(List a,List b,List c, Iterator ai, Iterator bi, Iterator ci, String next) {
		String n = null;
		switch(next) {
		case "a":
			if(ai.hasNext() == false) {
				return 'A';
			} else {
				n = (String)ai.next();
			}
			break;
		case "b":
			if(bi.hasNext() == false) {
				return 'B';
			} else {
				n = (String)bi.next();
			}
			break;
		case "c":
			if(ci.hasNext() == false) {
				return 'C';
			} else {
				n = (String)ci.next();
			}
			break;
		}
		return keisan(a,b,c,ai,bi,ci,n);
	}
}