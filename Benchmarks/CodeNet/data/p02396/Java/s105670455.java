import java.io.*;
public class Main{
	public static void main(String [] args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=0;
		for(int i=1;;i++){
			t=Integer.parseInt(br.readLine());
			if(0==t)break;
			System.out.println("Case "+i+": "+t);
		}}}