import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


	Stack stack=new Stack(1000);
	
	String str[]=br.readLine().split(" ");

	for(int i=0;i<str.length;i++){
	    if ( str[i].equals("+")){
		int a=stack.pop();
		int b=stack.pop();
		stack.push(b+a);
	    } else if ( str[i].equals("-") ){
		int a=stack.pop();
		int b=stack.pop();
		stack.push(b-a);
	    } else if ( str[i].equals("*")){
		int a=stack.pop();
		int b=stack.pop();
		stack.push(b*a);
	    } else {
		int x = Integer.parseInt(str[i]);
		stack.push(x);
	    }
	}
	System.out.println(stack.pop());
    }
}
class Stack{
    int top;
    final int MAX;
    int S[];
    
    public Stack(int MAX){
	top=0;
	this.MAX=MAX;
	S=new int[MAX];
    }
    public boolean isEmpty(){
	return top==0;
    }

    public boolean isFull(){
	return top>=MAX-1;
    }

    public void push(int x){
	if(!isFull()){
	    top++;
	    S[top]=x;
	}
    }
    public int pop(){
	if(!isEmpty()){
	    top--;
	    return S[top+1];
	}
	return -1;
    }
}

