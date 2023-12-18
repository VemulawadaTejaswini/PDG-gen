import java.io.*;
public class XCublic {
	public static void main(String args[]){
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String s=new String(in.readLine());
		int x=Integer.parseInt(s);
		System.out.println(x*x*x);
		}
}