import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		String t;
		int w,f;
		while((t=bf.readLine())!=null){
			w=Integer.parseInt(t);
			f=0;
			for(int i=0;i<9;i++)if((w>>>i&1)==1){System.out.print(((f==0)?"":" ")+(int)(1<<i));f++;}System.out.print("\n");
		}
	}
}