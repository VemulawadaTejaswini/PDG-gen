import java.io.*;
import java.util.Stack;
class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br
		= new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> s=new Stack<Integer>();
		while(true){
String buf;
			if((buf=br.readLine())==null)break;
			if(buf.length()==0)break;
			int dat=Integer.parseInt(buf);
			if(dat!=0)
				s.push(new Integer(dat));
			else
				System.out.println(s.pop());
		}
	}
}