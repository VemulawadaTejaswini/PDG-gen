import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        String symbol = sc.next();
 		int num2 = sc.nextInt();
   		int answer = 0;
      	if (symbol.equals("+")){
      		answer = num1 + num2;
        }else if (symbol.equals("-")){
        	answer = num1 - num2;
        }
      	sc.close();
        System.out.println(answer);
        
    }
}