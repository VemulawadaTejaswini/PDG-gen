import java.io.*;
import java.util.*;
public class Main{ 

	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		RPN rpn = new RPN(scan.nextLine());
        rpn.analyze();

	}
}
class Stack{
    ArrayList<Integer> stk;
    public Stack(){
        stk = new ArrayList<Integer>();
    }
    public void push(int val){
        stk.add(val);
    }
    public int pop(){
        int tmp=stk.get(stk.size()-1);
        stk.remove(stk.size()-1);
        return tmp;
    }
    public int ans(){
        return stk.get(0);
    }
}
class RPN{
    String[] exp;
    Stack stack;
    public RPN(String e){
        exp = e.split(" ", 0);
        stack = new Stack();
    }

    public void analyze(){
        int num;
        for(String str : exp){
            if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/"))
	            stack.push(calc(stack.pop(),stack.pop(),str.charAt(0)));
            else
                stack.push(Integer.parseInt(str));
        }
        System.out.println(stack.ans());
    }
    int calc(int b, int a, char op){
        if(op=='+')
            return a+b;
        if(op=='*')
            return a*b;
        if(op=='-')
            return a-b;
        System.out.println("error");
        return 0;
    }
}
 