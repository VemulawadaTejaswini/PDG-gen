import java.util.*;
public class Main {
	public static void main(String[] args) {
		for(Scanner sc = new Scanner(System.in);sc.hasNext();){
			String l=sc.next();
			int c=0, t=1;
			for(int p=0;p<l.length();p++, t=t*(9-p+1)/p)c=(t*(l.charAt(p)-'0')+c)%10;
			System.out.println(c);
		}
	}
}