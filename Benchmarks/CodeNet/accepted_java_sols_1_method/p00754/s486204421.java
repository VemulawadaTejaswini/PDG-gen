import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws Exception{
    	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    	Deque<Character> par= new LinkedList<Character>();
    	String str= new String();
    	while( !(str= br.readLine()).equals(".") ){
        	boolean balanced= true;
        	par.clear();
    		for(int i=0;i<str.length();i++){
        		if( str.charAt(i)=='(' ){
        			par.addFirst('(');
        		} else if( str.charAt(i)=='[' ){
        			par.addFirst('[');
        		}
        		else if( str.charAt(i)==')' ){
        			if( par.isEmpty() || par.remove()!='(' ){
        				balanced= false;
        				break;
        			}
        		} else if( str.charAt(i)==']' ){
        			if( par.isEmpty() || par.remove()!='[' ){
        				balanced= false;
        				break;
        			}
        		}
    		}
    		balanced= balanced && par.isEmpty();
    		if(balanced){ System.out.println("yes"); }
    		else{ System.out.println("no"); }
    	}
    }
}