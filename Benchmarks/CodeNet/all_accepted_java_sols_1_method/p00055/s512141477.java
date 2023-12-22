import java.io.*;

public class Main{
	public static void main(String[] args){
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s;
		double a;
		double ans;
		try{
			while((s=reader.readLine()) !=null){
				a=Double.parseDouble(s);
				ans=(1899*a)/243;
				System.out.println(ans);
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}