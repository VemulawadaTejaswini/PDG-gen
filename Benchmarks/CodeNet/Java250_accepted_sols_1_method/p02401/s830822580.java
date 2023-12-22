import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args)throws IOException{
	final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
	while(true){
	    String[] str=br.readLine().split(" ");
	    int a = Integer.parseInt(str[0]);
	    String op=str[1];
	    int b=Integer.parseInt(str[2]);
	    if(op.equals("?")) break;
	    if(op.equals("+")) System.out.println((a+b));
	    else if(op.equals("-")) System.out.println((a-b));
	    else if(op.equals("*")) System.out.println((a*b));
	    else if(op.equals("/")) System.out.println((a/b));    
	}
    }
}