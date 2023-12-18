import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
	    String S = scanner.next();
	    
	    int kotae = 0;
	    
	    for(int i=0; i<=3; i++) {
	    	if(S.substring(i, i+1).equals("+")) {
	    		kotae++;
	    	}else {
	    		kotae--;
	    	}
	    }
	    System.out.println(kotae);

	}

}