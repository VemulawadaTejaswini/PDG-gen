import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		int S,h,m,s;
		Scanner scan = new Scanner(System.in);
	     S = Integer.parseInt(scan.next());
		if((S>=0)&&(S<86400)){
		h=S/(60*60);
		m=(S%(60*60))/60;
		s=(S%(60*60))%60;
		System.out.println(h+":"+m+":"+s);
		}
		
	}
}