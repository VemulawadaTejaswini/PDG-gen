import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	String st, sx[] = {"A", "B", "AB", "O"};
	int a=0, b=0, ab=0, o=0;
	try{
	    while((st=sc.readLine())!=null){
		String[] bld = st.split(",");
		if(bld[1].equals(sx[0]))
		    a++;
		else if(bld[1].equals(sx[1]))
		    b++;
		else if(bld[1].equals(sx[2]))
		    ab++;
		else
		    o++;
	    }
	    System.out.println(a);
	    System.out.println(b);
	    System.out.println(ab);
	    System.out.println(o);
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}