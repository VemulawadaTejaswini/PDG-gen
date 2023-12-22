import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		String[] st=new String[str.length()];
		
		if(str.length()%2==0) {
			
			for(int i=0;i<str.length();i++) {
				st[i]=String.valueOf(str.charAt(i));
			}
			
			Arrays.sort(st);
			
			int ans=0;
			
			for(int i=0;i<str.length()/2;i++) {
				
				if(st[2*i].equals(st[2*i+1])){
					ans+=0;
				}else{
					ans+=1;
				}
			}
			
			if(ans==0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			
		}else {
			
			System.out.println("No");
			
		}
		
		sc.close();
	}
}