import java.io.*;

public class Main{
	public static void main(String[] args){
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		String s;
		String[] t;
		int[] a=new int[2];
		double x;
		try{
			while((s=reader.readLine()) !=null){
				t=s.split(" ");
				for(int i=0;i<2;i++){
					a[i]=Integer.parseInt(t[i]);
				}
				x=(a[0]*a[1])/3.305785;
				System.out.println(x);
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}