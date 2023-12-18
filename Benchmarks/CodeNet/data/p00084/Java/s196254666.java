import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try{
	    String sx = sc.readLine();
	    sx = sx.replace(".","");
	    sx = sx.replace(",","");
	    String[] st = sx.split(" ");
	    for(int i=0; i<st.length-1; i++){
		if(st[i].length()>2 && st[i].length()<7)
		    System.out.print(st[i]+" ");
	    }
	    if(st[st.length-1].length()>2 && st[st.length-1].length()<7)
		System.out.print(st[st.length-1]);
	    System.out.println();
	}catch (Exception e){
	    System.out.println("Error");
	}
    }
}