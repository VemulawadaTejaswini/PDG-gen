import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String S = sc.nextLine();
		int odd0 = 0;
		int odd1 = 0;
		int even0 = 0;
		int even1 = 0;
		for(int i=0;i<S.length();i++) {
			char c = S.charAt(i);
			if(i%2==0) {
				if(c=='0') even0++;
				else even1++;
			}else {
				if(c=='0') odd0++;
				else odd1++;
			}
		}
		System.out.println(Math.min(odd0+even1, odd1+even0));
    
  }
}
    