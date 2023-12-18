import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static void main (String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
	    Stack<String> stack = new Stack<String>();
	    while(line != null){
	        if("0".equals(line)){
	            System.out.println(stack.pop());
	        }else{
	            stack.push(line);
	        }
	        line = br.readLine();
	    }
	}
}