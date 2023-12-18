import java.io.*;
import java.uti.*;

public class Main{
	public static void main(String[] args){
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s,t,u;
		int a,b,hako;
		hako=0;
		String[] abc=new String[2];
		int[] xyz=new int[2];
		try{
			while(true){
				s=reader.readLine();
				t=reader.readLine();
				a=Integer.parseInt(s);
				b=Integer.parseInt(t);
				int[] x=new int[a+1];
				for(int j=1;j<(a+1);j++){
					x[j]=j;
				}
				for(int i=0;i<b;i++){
					u=reader.readLine();
					abc=u.split(",");
					for(int k=0;k<2;k++){
						xyz[k]=Integer.parseInt(abc[k]);
					}
					hako=x[xyz[0]];;
					x[xyz[0]]=x[xyz[1]];
					x[xyz[1]]=hako;
				}
				for(int l=1;l<(a+1);l++){
					System.out.println(x[l]);
				}
				continue;
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}