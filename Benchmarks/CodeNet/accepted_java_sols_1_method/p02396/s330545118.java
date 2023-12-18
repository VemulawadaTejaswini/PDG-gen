import java.io.*;
public class Main{
	public static void main(String [] args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(int i=1;;i++){
			int t=Integer.parseInt(br.readLine());
			if(0==t)break;
			System.out.println("Case "+i+": "+t);
		}}}