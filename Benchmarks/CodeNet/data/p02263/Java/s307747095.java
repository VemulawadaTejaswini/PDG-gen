import java.util.Scanner;
import java.util.Stack;

class Main{

	public static void main(String args[]){
        Stack<String> problem = new Stack<String>();
        Scanner s = new Scanner(System.in);
        
        String equation = s.nextLine();
        String[] parts = equation.split(" ");
        int len = parts.length;
        int i = 0;
        
        int x;
        int y;
        
        while(i < len){
            if(parts[i].equals("+")){
                x = Integer.parseInt((String) problem.pop());
                y = Integer.parseInt((String) problem.pop());
                problem.push(Integer.toString(x+y));
            }
            else if(parts[i].equals("-")){
                x = Integer.parseInt((String) problem.pop());
                y = Integer.parseInt((String) problem.pop());
                problem.push(Integer.toString(y-x));
            }
            else if(parts[i].equals("*")){
                x = Integer.parseInt((String) problem.pop());
                y = Integer.parseInt((String) problem.pop());
                problem.push(Integer.toString(x*y));
            }
            else if(parts[i].equals("/")){
                x = Integer.parseInt((String) problem.pop());
                y = Integer.parseInt((String) problem.pop());
                problem.push(Integer.toString(x/y));
            }
            else{
                problem.push(parts[i]);
            }
            i++;
            
        }
        System.out.println(problem.pop());
    }
}
