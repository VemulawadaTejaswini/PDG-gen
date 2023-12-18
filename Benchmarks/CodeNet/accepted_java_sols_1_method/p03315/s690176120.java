import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
 	    // 引数で標準入力System.inを指定する
 	    Scanner scanner = new Scanner(System.in);
 	    String S = scanner.next();
 	    int answer = 0;
 	    
 	    for(int i=0; i<4; i++) {
 	    	if(S.substring(i,i+1).equals("+")) {
 	    		answer++;
 	    	}else {
 	    		answer--;
 	    	}
 	    }
 	    System.out.println(answer);
 	    
 	    
	}

}