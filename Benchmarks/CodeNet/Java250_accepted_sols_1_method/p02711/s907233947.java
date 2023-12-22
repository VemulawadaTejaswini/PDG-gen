import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		char[] work = new char[num.length()];
		int flag = 0;
	    for(int i = 0; i < num.length(); i++){
	    	if(num.charAt(i) == '7') {
	    		flag = 1;
	        }
	    }
	    if(flag == 1) {
	    	System.out.println("Yes");
	    }else {
	    	System.out.println("No");
	    }
	}
}
