import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			String S = scan.next();
			
			char[] s = new char[S.length()];
			s = S.toCharArray();
			
			int maxcount = 0;
			int nowcount = 0;
			
			for(int i =0;i<S.length();i++) {
				if(s[i]=='A'||s[i]=='C'||s[i]=='G'||s[i]=='T') {
						nowcount++;
						if(maxcount<nowcount) 
							maxcount =nowcount;
				}else{
					if(nowcount>0&&maxcount<nowcount) {
						maxcount = nowcount;
						nowcount =0;
					}else {
						nowcount = 0;
					}
					
					
				}
				
			}
		
			
			
			System.out.println(maxcount);
			
			
			
			
			
			
		}
		
	}
		

}
