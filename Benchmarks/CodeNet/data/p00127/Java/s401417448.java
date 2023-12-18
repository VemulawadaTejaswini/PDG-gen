import java.util.Scanner;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		while(in.hasNext())new AOJ0127().doIt();
	}
	
	class AOJ0127{
		String hyou = "abcdefghijklmnopqrstuvwxyz.?! ";
		void doIt(){
			String input = in.next();
			if(input.length()%2==1){
				System.out.println("NA");return;
			}
			for(int i=0;i<input.length();i+=2){
				int a = Integer.parseInt(input.charAt(i)+"")-1;
				int b = Integer.parseInt(input.charAt(i+1)+"")-1;
//				System.out.println(a+" "+b);
				System.out.print(hyou.charAt(5*a+b));
			}
			System.out.println();
			
		}
	}
	
}