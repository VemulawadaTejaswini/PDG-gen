import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Stack stack = new Stack();

        while(sc.hasNextInt()){
        	int in = sc.nextInt();

        	if(in > 0){
        		stack.push(in);
        	}else{
        		System.out.println(stack.pop());
        	}
        }
    }
}        