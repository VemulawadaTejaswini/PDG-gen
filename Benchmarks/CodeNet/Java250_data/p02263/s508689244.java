import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
    	int[] stack = new int[100];
    	int now = 0;
    	while(scan.hasNext()){
    		String line = scan.next();
    		switch(line){
    			case "+":
    				stack[now - 2] += stack[now - 1];
    				now--;
    				break;
    			case "-":
    				stack[now - 2] -= stack[now - 1];
    				now--;
    				break;
    			case "*":
    				stack[now - 2] *= stack[now - 1];
    				now--;
    				break;
    			default:
	    			stack[now] = Integer.parseInt(line);
    				now++;
    		}
    	}
    	System.out.println(stack[0]);
    }
}
