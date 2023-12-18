import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		boolean ans = true;
		StringBuffer sb = new StringBuffer();
		sb.append(S);
		
		//all
		StringBuffer reverce = sb.reverse();
		if(!S.equals(reverce.toString())) {
			ans = false;
		}
		
		//former
		String former = S.substring(0, (S.length() - 1) / 2);
		StringBuffer formerSb = new StringBuffer();
		formerSb.append(former);
		StringBuffer reverceFormer = formerSb.reverse();
		if(!former.equals(reverceFormer.toString())) {
			ans = false;
		}
		
		
		if(ans) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}
	
}