import java.io.*;

public class Main{
	public static void main(String[] args){
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		String s;
		double a=100000.0;
		int n,b;
		double p,q;
		try{
			while((s=reader.readLine()) !=null){
				n=Integer.parseInt(s);
				for(int i=0;i<n;i++){
					a +=a*0.05;
					p=a/1000;
					q=Math.ceil(p);
					a=q*1000;
				}
				b=(int)a;
				System.out.println(b);
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}