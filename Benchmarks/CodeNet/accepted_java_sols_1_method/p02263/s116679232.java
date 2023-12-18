
import java.util.*;


public class Main {
	public static void main(String[] args) {	 
	        int number1;
	        int number2;
	        int answer;
	        Scanner in = new Scanner(System.in);
	        Stack<Integer> stack = new Stack<Integer>();
	        String operator = in.nextLine();
	        String[] arr = operator.split(" ");
	        
	        for(String t : arr){
	           
	                switch(t){
	                    case "+":
	                    	number1 = stack.pop();
	                    	number2 = stack.pop();
	                        stack.push(number2 + number1);
	                        break;
	                    case "-":
	                    	number1 = stack.pop();
	                    	number2 = stack.pop();
	                        stack.push(number2 - number1);
	                        break;
	                    case "*":
	                    	number1 = stack.pop();
	                    	number2 = stack.pop();
	                        stack.push(number2 * number1);
	                        break;
	                    case "/":
	                    	number1 = stack.pop();
	                    	number2 = stack.pop();
	                        stack.push(number2 / number1);
	                        break;
	                       
	                    default:
	                    	stack.push(Integer.parseInt(t));
	                    	break;
	                }
	            }
	        answer = stack.pop();
	        System.out.println(answer);
	    }
}

