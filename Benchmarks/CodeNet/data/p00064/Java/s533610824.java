import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try{
	    String st;
	    int sum = 0;
	    while((st = sc.readLine())!=null){
		for(int i=0; i<st.length(); i++){
		    char c = st.charAt(i);
		    if(Character.isDigit(c)){
			int x = c - '0';
			for(i=i+1; i<st.length(); i++){
			    c = st.charAt(i);
			    if(!Character.isDigit(c))
				break;
			    x*=10;
			    x+=c-'0';
			}
			sum+=x;
		    }
		}
	    }
	    
	    System.out.println(sum);
	}catch (Exception e){
	    System.out.println("Error");
	}
    }
}