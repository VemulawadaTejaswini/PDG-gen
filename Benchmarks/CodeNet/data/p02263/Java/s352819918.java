import java.util.*;

public class Main {
       
    
    public static void main(String[] args){                
        Scanner input = new Scanner(System.in);
        String grab;
        Stack<Integer> stack = new Stack<Integer>();
        while (input.hasNext()) {                        
            grab = input.next();
            
            if (Character.isDigit(grab.charAt(0))) {
            stack.push(Integer.parseInt(grab));
            }//if
            else {
                int a = stack.pop();
                int b = stack.pop();
                if (grab.equals("+")){
                    stack.push(a + b);
                }//if 
                if (grab.equals("-")){ 
                stack.push(b - a);
                }//if
                if (grab.equals("*")){
                stack.push(b * a);
                }//if
            }//else
        }//while
        System.out.println(stack.pop());
    }//main            
}//Main


