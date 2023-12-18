package Volume100;
import java.util.*;
public class a10032 {
    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	Stack<String> st=new Stack<String>();
        while(true){
        	String com=s.next();
        	if(com.equals("push")){
        		String cc=s.next();
        		st.push(cc);
        	}
        	else if(com.equals("pop"))System.out.println(st.pop());
        	else if(com.equals("quit"));
        }
    }
}