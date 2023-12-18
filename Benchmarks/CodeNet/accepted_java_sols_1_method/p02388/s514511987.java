import java.io.*;

public class Main{
 public static void main(String[] args){
	try{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int x = Integer.parseInt(br.readLine());
	int ans = x*x*x;
	System.out.println(ans); 
	}catch(IOException e){
	System.out.println(e);
	}
 }
}