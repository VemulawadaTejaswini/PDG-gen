import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] p = new int[4];
		for(int i=0;i<n;i++){
			String line = br.readLine();
			String[] str = line.split(" ");
			int r = Integer.parseInt(str[0]);
			int t = Integer.parseInt(str[1]);
			boolean bR=false;
			boolean bT=false;
			if(r%100==0)bR=true;
			if(t%30==0)bT=true;
			if(bR&&bT){
				p[0]=(r/100)+(t/30)*5;
				System.out.println(p[0]);
			}else if(bR&&!bT){
				double tmp = (double)t/30;
				p[0]=(r/100)+((int)Math.floor(tmp))*5;
				p[1]=(r/100)+((int)Math.ceil(tmp))*5;
				System.out.println(p[0]+" "+p[1]);
			}else if(!bR&&bT){
				double tmp = (double)r/100;
				p[0]=((int)Math.floor(tmp))+(t/30)*5;
				p[1]=((int)Math.ceil(tmp))+(t/30)*5;
				System.out.println(p[0]+" "+p[1]);
			}else if(!bR&&!bT){
				double tr = (double)r/100;
				double tt = (double)t/30;
				p[0]=((int)Math.floor(tr))+((int)Math.floor(tt))*5;
				p[1]=((int)Math.ceil(tr))+((int)Math.floor(tt))*5;
				p[2]=((int)Math.floor(tr))+((int)Math.ceil(tt))*5;
				p[3]=((int)Math.ceil(tr))+((int)Math.ceil(tt))*5;
				System.out.println(p[0]+" "+p[1]+" "+p[2]+" "+p[3]);
			}
		}
	}
}