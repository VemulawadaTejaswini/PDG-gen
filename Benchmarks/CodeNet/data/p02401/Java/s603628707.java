import java.io.*;
public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String[] i=str.split(" ");
		int a=Integer.parseInt(i[0]);
		String op=(i[1]);
		int b=Integer.parseInt(i[2]);
		while (i[1]!="?"){
			if(op=="+") System.out.println(a+b);
			else if(op=="-")System.out.println(a-b);
			else if(op=="*")System.out.println(a*b);
			else if(op=="/")System.out.println(a/b);
			str=br.readLine();
			i=str.split(" ");
			a=Integer.parseInt(i[0]);
			op=(i[1]);
			b=Integer.parseInt(i[2]);
		}
	}
}