

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {


   public static void main(String args[]) throws IOException{

	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 String[] string =  br.readLine().split(" ");
	 String[] formula = new String[ string.length ];


	 Stack stack = new Stack();
     stack.initialize();


     for(int i = 0;i < string.length; i++){


    	 if( string[i].equals("+")  ){
    		 int x = Integer.parseInt(stack.pop() );
    		 int y = Integer.parseInt(stack.pop() );
             int result = x + y;
             stack.push( String.valueOf(result) );
    	 }
    	 else if( string[i].equals("-") ){
    		 int x = Integer.parseInt(stack.pop() );
    		 int y = Integer.parseInt(stack.pop() );
    		 int result = y - x;
             stack.push( String.valueOf(result) );

    	 }
    	 else if( string[i].equals("*") ){
    		 int x = Integer.parseInt(stack.pop() );
    		 int y = Integer.parseInt(stack.pop() );
    		 int result = x * y;
             stack.push( String.valueOf(result) );
    	 }
    	 else{
    		 stack.push( string[i] );
    	 }
     }


     System.out.println(stack.pop());
 }
}

class Stack {
	int top = 0;
    int MAX = 200;
    String[] S = new String[200];


	void initialize(){
       top = 0;
    }

    boolean isEmpty(){
    	return top == 0;
    }


    boolean isFull(){
    	return top >= MAX - 1;
    }

    void push(String x ){

    	if(isFull()){System.out.println("??¨??????");}
    	top++;
        S[top] = x;

    }

    String pop(){
    	if(isEmpty()){System.out.println("??¨??????");}
    	top--;
    	return  S[top+1];
    }



}