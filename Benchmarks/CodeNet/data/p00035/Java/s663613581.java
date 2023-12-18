import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		String t;
		double[] p = new double[12];
		while((t=bf.readLine())!=null){
			String[] d=t.split(",");
			for(int i=0;i<8;i++)p[i]=Double.parseDouble(d[i]);
			for(int i=0;i<4;i++)p[i+8]=p[i];
			for(int i=2;i<=8;i+=2){
				if(((p[i+1]-p[i-1])*(p[i]-p[i+2])-(p[i]-p[i-2])*(p[i+1]-p[i+3]))<=0){System.out.println("NO");break;}
				if(i==8)System.out.println("YES");
			}
		}
	}
}