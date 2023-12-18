import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	try{
	    BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
	    String st;
	    Character c;
	    st = b.readLine();
	    
	    for(int i=0; i<st.length(); i++)
		if((int)st.charAt(i)>=65 && (int)st.charAt(i)<=90)
		    System.out.print((char)((int)st.charAt(i)+32));
		else if((int)st.charAt(i)>=97 && (int)st.charAt(i)<=122)
		    System.out.print((char)((int)st.charAt(i)-32));
		else
		    System.out.print(st.charAt(i));
	    System.out.println();
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}