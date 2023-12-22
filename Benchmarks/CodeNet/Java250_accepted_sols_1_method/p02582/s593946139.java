import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		int c = 1;
		for(int i = 0;i<3-1;i++) {
			char[] ch = s.toCharArray();
			
			 if(ch[i] =='S' && ch[i+1] == 'S') {
				c=0;
			}
			else if((ch[i]=='R' && ch[i+1] == 'R')){
				c++;
			}
			else if((ch[i] == 'S' && ch[i+1] == 'R')) {
				c=1;
			}
			 if(s.charAt(0) == 'R' && s.charAt(1) == 'S' && s.charAt(2)== 'S'){
				c=1;
			}
			
			
			
			
			
		}
		System.out.println(c);

	}

}
