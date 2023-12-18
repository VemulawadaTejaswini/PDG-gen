import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		int s,v;
		String t;
		int[] p = new int[12];
		while((t=bf.readLine())!=null){
			String[] d=t.split(",");
			for(int i=0;i<12;i++)p[i]=Integer.parseInt(d[i]);
			s=0;for(int i=0;i<10;i++)s+=p[i];
			v=p[10]+p[11];
			double c=(double)p[10]*s/v;
			for(int i=0;i<10;i++){
				c-=(double)p[i];
				if(c<=0){System.out.println((i+1));break;}
			}
		}
	}
}