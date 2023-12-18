import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=reader.readLine())!=null){
			String[] t;
			t=s.split(" ");
			int[] n=new int[2];
			for(int i=0;i<2;i++){
				n[i]=Integer.parseInt(t[i]);
			}
			System.out.println(n[0]*n[1]+" "+(2*n[0]+2*n[1]));
		}
	}
}