
import java.util.*;

public class Main {
	 
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		int n=cin.nextInt();
		int taro=0,hanako=0;
		
		for(int i=0;i<n;i++) {
			String Ts=cin.next(),Hs=cin.next();
			int j=Ts.compareTo(Hs);
			if(j>0)taro+=3;
			else if(j<0)hanako+=3;
			else {
				taro++;hanako++;
			}
		}
		System.out.println(taro+" "+hanako);
	}
	
	
}
