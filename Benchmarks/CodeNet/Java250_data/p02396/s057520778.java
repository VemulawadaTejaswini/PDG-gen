import java.io.*;
public class Main{
	public static void main(String [] args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=0;
		for(int i=1;0!=(t=Integer.parseInt(br.readLine()));i++){
			System.out.println("Case "+i+": "+t);
		}}}