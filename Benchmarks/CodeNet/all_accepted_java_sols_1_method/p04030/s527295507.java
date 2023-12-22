
import java.util.*; 
public class Main {
    public static void main(String[] args)  {
      Scanner in = new Scanner(System.in);
           String s = in.next();
           Stack<Character> st = new Stack<Character>();
           for (int i =0;i<s.length();i++) {
        	   if (s.charAt(i) == 'B' && st.size()!=0) {
        		   st.pop();}
        	   else if (s.charAt(i) != 'B'){
        		   st.push(s.charAt(i));
        	   }
           }
           for (Character ch : st) {
			System.out.print(ch);
		}
           System.out.println();
           
    }
 
}