import java.util.*;
public class Main{
	public static void main(String args[]){
	    Scanner input = new Scanner(System.in);
	    
	    Queue<Integer>num = new LinkedList<Integer>();
	    Queue<String> p = new LinkedList<String>();
	    int number = input.nextInt();
	    int time = input.nextInt();
	    int timer = 0;
	    for(int i = 0; i < number; i++ ){
	    	p.add(input.next());
	        num.add(input.nextInt());
	    }//for
	    
	    while(!num.isEmpty()){
	    	String test2 = p.remove();
	        int test = num.remove();
	        if(test - time <= 0 ){
	            timer += test;
	            System.out.println(test2 +  " " +(timer));
	        }//if
	        if(test - time > 0){
	        	p.add(test2);
	            num.add(test - time);
	            timer += time;
	        }//if
	        
	    }//while
	    
}//main
}//main
