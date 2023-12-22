/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String s = br.readLine();
	    Stack<Integer> st = new Stack<>();
	    
	    
	    int len = s.length();
	    int remove = 0;
	    for(int i = len-1; i >= 0; i--) {
	        if(st.empty()) {
	            st.push(i);
	        } else if(s.charAt(st.peek()) == s.charAt(i)) {
	            st.push(i);
	        } else {
	            st.pop();
	            remove++;
	        }
	    }
	    
		System.out.println(((long)remove)*2L);
	}
}
