
import java.io.*;
public class ITP1_B {
	public static void main(String[] args)throws IOException {
		BufferedReader a=new BufferedReader(new InputStreamReader(System.in));
		String n=a.readLine();
		int s=Integer.parseInt(n);
		int[] k;k=new int[53];int e=0;
		for(int z=1;z<=s;z++){
			String x=a.readLine();
			String[] i=x.split(" ");
			e=Integer.parseInt(i[1]);
			if (i[0].equals("S"))k[e]=1;
			else if(i[0].equals("H"))k[e+13]=1;
			else if(i[0].equals("C"))k[e+26]=1;
			else if(i[0].equals("D"))k[e+39]=1;
		}
		int m=52-s;int c=0;int f=0;
		for(int z=1;z<=52;z++){
			if(k[z]==1)continue;
			e=z/13;f=z-e*13;
			if(e==0)
				System.out.println("S "+f);
			else if(e==1)
				System.out.println("H "+f);
			else if(e==2)
				System.out.println("C "+f);
			else if(e==3)
				System.out.println("D "+f);
			c++;
			if(m==c)break;
		}
	}
}