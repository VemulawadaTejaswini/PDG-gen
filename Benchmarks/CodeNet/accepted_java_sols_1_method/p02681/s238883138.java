import java.math.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		int t=sc.nextInt();
//		for(int x=1;x<=t;x++){
			String s=sc.next();
			String ss=sc.next();
			boolean flag=true;
			if(s.length()>=ss.length()){
				System.out.println("No");
				return;
			}else {
				for(int i=0;i<s.length();i++){
					if(s.charAt(i)!=ss.charAt(i)){
						flag=false;
					}
//					System.out.println(i);
				}
			}
			System.out.println(flag?"Yes":"No");
//		}
	}
}