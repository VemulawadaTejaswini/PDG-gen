import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		char[] t = stdIn.next().toCharArray();
		
		
		//文字の長さ１のとき例外
		if(t.length == 1) {
			if(t[0]=='?') {
				System.out.println('D');
				return;
			}else {
				System.out.println(t[0]);
				return;
			}
			
		}
		
		
		
		for(int i = 0; i < t.length-1; i++) {
			if(i==0) {
				if(t[i]=='?' &&  t[i+1] == 'D') {
					System.out.print('P');
				}else if(t[i]=='?' && t[i+1]== 'P') {
					System.out.print('D');
				}else if(t[i]=='?' && t[i+1]=='?') {
					System.out.print('P');
				}else {
					System.out.print(t[i]);
				}
			
			}else {
				if(t[i]=='?' && t[i+1]=='?' && t[i-1]!='?') {
					
					if(t[i-1] == 'P') {
						System.out.print('D');
					}else {
						System.out.print('P');
					}
					
					
				}else if(t[i]=='?' && t[i+1]=='?' && t[i-1]=='?') {
					System.out.print('D');
				
				}else if(t[i] == '?') {
					System.out.print('D');
					
					
				}else {
					System.out.print(t[i]);
				}
				
				
				
			}
			
		}
		
		if(t[t.length-1] == '?') {
			System.out.print('D');
			
		}else {
			System.out.println(t[t.length-1]);
		}
		
		
		
		
	}

}
