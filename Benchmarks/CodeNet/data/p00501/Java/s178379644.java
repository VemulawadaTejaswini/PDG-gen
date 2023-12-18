import java.util.Scanner;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0578().doIt();
	}
	
	class AOJ0578{
		String board;
		void doIt(){
			int n = in.nextInt();
			board = in.next();
			int cnt = 0;
			for(int i=0;i<n;i++){
				if(result(in.next()))cnt++;
//				System.out.println(cnt);
			}
			System.out.println(cnt);
		}
		
		boolean result(String text){
//			System.out.println(text);
			for(int i=1;i<text.length();i++){//抜く数
				for(int s=0;s<text.length();s++){//start position
					StringBuffer sb = new StringBuffer();
					for(int k=s;k<text.length();k+=i){
						sb.append(text.charAt(k));
						if(sb.toString().equals(board))return true;
					}
					if(sb.toString().equals(board))return true;
				}
			}
			return false;
		}
		
	}
		
}