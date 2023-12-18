import java.io.*;

public class Main{
	public static void main(String[] args){
		String s;
		int d,n,number,x;
		int sum=0;
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		try{
			while((s=r.readLine()) !=null){
				x=0;
				d=Integer.parseInt(s);
				number=600/d;
				for(int i=0;i<number;i++){
					sum +=d*x*x;
					x +=d;
				}
				System.out.println(sum);
				sum=0;
				continue;
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}