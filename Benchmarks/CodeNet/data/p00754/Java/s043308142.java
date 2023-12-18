import java.util.*;
class Stack{
    private Object stack[];
    private int stackSize;
    private int sp;
    public Stack(int n){
	stack = new Object[n];
	sp = 0;
    }

    public void clear(){ sp = 0; }
    public void push(Object x){ stack[sp++] = x; }
    public Object pop(){
	if(sp>0)
	    return stack[--sp];
	else return null;
    }
    public boolean isEmpty(){ return sp==0; }
}

public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	int i;

	Stack[] stack = new Stack[2];
	for(i=0; i<2; i++){
	    stack[i] = new Stack(100);
	}
	/*
	  0:"("  1:"["
	 */

	while(kbd.hasNext()){
	    String line = kbd.nextLine();
	    int len = line.length();
	    i=1;
	   
	    if(! line.equals(".")){
		while(i<len){
		    String c = line.substring(i, i+1);
		    //System.out.println(c);
		    if(c.equals("(")){
			stack[0].push("(");
		    }
		    else if(c.equals(")")){
			stack[0].pop();
		    }
		    else if(c.equals("[")){
			stack[1].push("[");
		    }
		    else if(c.equals("]")){
			stack[1].pop();
		    }
		    i++;
		}
		//System.out.println(stack[0].isEmpty()+" "+stack[1].isEmpty());
		if(stack[0].isEmpty() && stack[1].isEmpty())
		    System.out.println("yes");
		else 
		    System.out.println("no");
	    }
	}
    }
}
		
		