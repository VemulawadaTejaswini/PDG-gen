import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws IOException{
	String a;
	int b;
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br =new BufferedReader(isr);
	a= br.readLine();
	while(a!=null){
	    StringTokenizer st = new StringTokenizer(a);
	    b=Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
	    b=(int)Math.log10(b)+1;
	    System.out.println(b);
	    a=br.readLine();
	    }
}
}