import java.util.*;
public class Main {
    public static void main(String[] ano) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        Stack <Integer> stack = new Stack <Integer> ();
        while(scan.hasNext()){
        	int in =scan.nextInt();
        	if(in == 0)System.out.println(stack.pop());
        	else stack.push(in);
        }
    }
}