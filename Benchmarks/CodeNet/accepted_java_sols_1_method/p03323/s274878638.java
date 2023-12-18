import java.util.*;

/**
 * 2018.06.16 
 */

public class Main {

	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
	    int A = scanner.nextInt();
	    int B = scanner.nextInt();
	    
	    //入力チェック
	    if((A + B) > 16){
	    	//error
	    }else if(A > 8){
	    	System.out.println(":(");
	    }
	    else if (B > 8){
	    	System.out.println(":(");
	    }else{
	    	System.out.println("Yay!");
	    }
	}

}
