
import java.util.*;

public class Main {
	 
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		while(true) {
			String str=cin.nextLine();
			
			int sum=0;
			
			for(int i=0;i<str.length();i++) {
				char c=str.charAt(i);
				if(i==0 && c=='0')return;
				sum+=(int)(c-48);
			}
			
			System.out.println(sum);
		}
	}
	
}
