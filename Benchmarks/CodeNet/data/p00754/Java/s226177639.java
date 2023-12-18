import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    
	    char[] charData = sc.nextLine().toCharArray();
	     
	    if(charData[0] == '.') break;

	    Stack<Character> st = new Stack<Character>();
	    
	    for(int i = 0;i<charData.length;i++){
		if(charData[i] == '(') st.push('(');
		if(charData[i] == '[') st.push('[');
		if(!st.empty()){
		    if(charData[i] == ')' && st.peek().equals('(')) st.pop();
		    if(charData[i] == ']' && st.peek().equals('[')) st.pop();
		}
	    }
	    
	    System.out.println(st.empty() ? "yes" : "no");
	    
	}
    }
}