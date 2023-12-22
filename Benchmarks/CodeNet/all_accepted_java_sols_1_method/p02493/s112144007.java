import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String s;
		int n;
		String[] t;
		while((s=r.readLine())!=null){
			t=r.readLine().split(" ");
			n=Integer.parseInt(s);
			for(int i=n-1;i>=1;i--){
				System.out.print(t[i]+" ");
			}
			System.out.print(t[0]);
			System.out.println("");
		}
	}
}