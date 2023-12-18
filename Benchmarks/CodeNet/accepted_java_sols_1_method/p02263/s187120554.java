import java.util.Scanner;
import java.util.Stack;

public class Main {

	
	public static void main(String argv[]) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String num1,num2;
        int n1,n2;
        String[] tokens = str.split(" ");
        
        Stack<String> stack = new Stack<>();
        for(int i=0; i<tokens.length; i++)
        {
        	if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*"))
        	{
        		num2 = stack.pop();
        		num1 = stack.pop();
        		n1 = Integer.parseInt(num1);
        		n2 = Integer.parseInt(num2);
        		if(tokens[i].equals("+")) 
        		{
        			n1 = n1 + n2;
        			stack.push(Integer.toString(n1));
        		}
        		else if(tokens[i].equals("-"))
        		{
        			n1 = n1 - n2;
        			stack.push(Integer.toString(n1));
        		}
        		else if(tokens[i].equals("*"))
        		{
        			n1 = n1 * n2;
        			stack.push(Integer.toString(n1));
        		}
        	}
        	else
        	{
        		stack.push(tokens[i]);
        	}        		
        }
        
        System.out.println(stack.pop());
        in.close();
    }
}

