import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader tec=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);
		for(String line;(line=tec.readLine())!=null;){
			int n=Integer.parseInt(line.trim());
			int[]arr=new int[n];
			for (int i = 0; i < arr.length; i++) 
				arr[i]=Integer.parseInt(tec.readLine().trim());
			if(n==1){
				out.println(arr[0]/2);
				continue;
			}
			long x=arr[0],cont=0;
			
			for (int i = 1; i < arr.length; i++) {				
				x+=arr[i];
				cont+=x/2;
				if((x&1)==1&&arr[i]!=0){
					x=1;
				}else{
					x=0;
				}				
			}
			out.println(cont);
		}
		out.close();		
	}
}