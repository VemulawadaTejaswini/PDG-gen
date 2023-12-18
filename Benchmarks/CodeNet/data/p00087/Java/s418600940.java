import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
class Main{
    public static void main(String[] a) throws IOException{
    	
    	Scanner scan = new Scanner(System.in);
    	while (scan.hasNext()){ 
    	String[] string = scan.nextLine().split(" ");
    	Stack <Double> que = new Stack<Double>();
 
    	for(int i = 0;i < string.length;i++){
    		if(string[i].equals("+")){
    			double x = que.pop();
    			double y = que.pop();
    			que.push(x+y);
    		}
    		else if(string[i].equals("-")){
    			double x = que.pop();
    			double y = que.pop();
    			que.push(y-x);
    			
    		}
    		else if(string[i].equals("*")){
    			double x = que.pop();
    			double y = que.pop();
    			que.push(x*y);
    		
    		}
    		else if(string[i].equals("/")){
    			double x = que.pop();
    			double y = que.pop();
    			que.push(y/x);
    		
    		}else{
    			que.push(Double.parseDouble(string[i]));
    		}
    		
    	}
    	
    	System.out.printf("%.6f\n", que.pop());

    }
 }
}