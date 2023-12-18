
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
	final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
	while(true){
	    String str=br.readLine();
	    int a = Integer.parseInt(str);
	    String op=br.readLine();
	    str=br.readLine();
	    int b=Integer.parseInt(str);
	    if(a==0 &&(op.equals("?"))&& b==0) break;
	    if(op.equals("+")) System.out.println((a+b));
	    else if(op.equals("-")) System.out.println((a-b));
	    else if(op.equals("*")) System.out.println((a*b));
	    else if(op.equals("/")) System.out.println((a/b));
	    else if(op.equals("%")) System.out.println((a%b));	    
	}
    }
}