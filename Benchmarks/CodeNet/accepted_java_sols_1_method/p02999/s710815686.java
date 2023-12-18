import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int A = sc.nextInt();
		int X = sc.nextInt();
		
		if(A<X){
			System.out.println("0");
		}else{
			System.out.println("10");
		}

	    
   		sc.close();
        return ;

    }
    
}

