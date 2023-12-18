import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader S =new BufferedReader(new InputStreamReader(System.in));
		String str=S.readLine();
		int time=Integer.parseInt(str);
		int h=time/(3600);
		int m=(time%3600)/60;
		int s=time%(3600/60);
		System.out.println(h+":"+m+":"+s);
		
		
	
		
	}
}