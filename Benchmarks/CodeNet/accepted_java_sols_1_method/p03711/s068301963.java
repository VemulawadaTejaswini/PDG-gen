import java.util.*;
 
public class Main{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
    	int num1 = sc.nextInt();
        int num2 = sc.nextInt();
		if(num1 == 2 && num2 == 2){
        	System.out.println("Yes");
        }else if((num1 == 4 || num1 == 6 || num1 == 9 || num1 == 11) 
                 && (num2 == 4 || num2 == 6 || num2 == 9 || num2 == 11)){
        	System.out.println("Yes");
        }else if((num1 == 1 || num1 == 3 || num1 == 5 || num1 == 7 || num1 == 8 || num1 == 10 || num1 == 12) 
                 && (num2 == 1 || num2 == 3 || num2 == 5 || num2 == 7 || num2 == 8 || num2 == 10 || num2 == 12)){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
	}
}