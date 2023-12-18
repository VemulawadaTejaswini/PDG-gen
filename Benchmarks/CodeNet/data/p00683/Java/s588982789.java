import java.util.*;
import static java.lang.Math.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int t=Integer.parseInt(sc.nextLine());t>0;t--) {
			StringBuilder sb = new StringBuilder(sc.nextLine());
			int n = sc.nextInt(), p = 0; sc.nextLine();
			for(;n>0;n--){
				String sp = sc.nextLine();
				int c1 = sp.charAt(0), c2 = sp.split(" ")[1].charAt(0);
				int c=0;
				if(c1=='b') c=-1; else if(c1=='f') c=1; else c=0;
				if(c2=='c') { p=min(sb.length(),max(0,p+c)); if(c==0&&sb.length()>p&&p>=0) sb.deleteCharAt(p); }
				else if(c2=='w')for(p=min(sb.length(), max(-1, p+c));0<=p&&p<sb.length();p=p+c) if(sb.charAt(p)==' ') break; else if(c==0)sb.deleteCharAt(p);
				if(c1=='i') { p=min(sb.length(), max(-1, p+c)); sb.insert(p, sp.substring(8, sp.length()-1)); p+=sp.length()-9;}
			}
			p=min(sb.length(),max(0,p));
			System.out.println(sb.substring(0, p) + "^" + sb.substring(p));
		}
	}
}