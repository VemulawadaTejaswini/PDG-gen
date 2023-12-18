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
			StringBuffer result = new StringBuffer("");
			for(int i=0;i<input.length();i+=2){
				if(isOK(input.charAt(i))||isOK(input.charAt(i+1))){
					System.out.println("NA");return;
				}
				int a = Integer.parseInt(input.charAt(i)+"")-1;
				int b = Integer.parseInt(input.charAt(i+1)+"")-1;
				if(5*a+b>=hyou.length()||5*a+b<0){
					System.out.println("NA");return;
				}
				result.append(hyou.charAt(5*a+b));
			}
			System.out.println(result);
		}
		
		boolean isOK(char a){
			return (a=='0'||a=='1'||a=='2'||a=='3'||a=='4'||a=='5'||a=='6'||a=='7'||a=='8'||a=='9')==false;
		}
		
	}
	
}