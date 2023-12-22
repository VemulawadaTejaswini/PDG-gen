import java.io.*;
public class Main{
    static void scan()throws IOException{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	String str=br.readLine();
	turn(str);
    }

    static void turn(String str){
	int l = str.length();
	for(int i=l-1;i>0;i--)
	    System.out.print(str.charAt(i));
System.out.println(str.charAt(0));
    }
    
    public static void main(String[] args)throws IOException{
	scan();
    }
}