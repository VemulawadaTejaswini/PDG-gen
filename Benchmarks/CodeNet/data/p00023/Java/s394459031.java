import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s,t;
		String[] u;
		double[] q;
		double l,p;
		double xa,ya,ra,xb,yb,rb;
		int n;
		int[] ans;
		while((s=reader.readLine())!=null){
			n=Integer.parseInt(s);
			ans=new int[n];
			for(int i=0;i<n;i++){
				t=reader.readLine();
				u=t.split(" ");
				q=new double[6];
				for(int k=0;k<6;k++){
					q[k]=Double.parseDouble(u[k]);
				}
				xa=q[0];
				ya=q[1];
				ra=q[2];
				xb=q[3];
				yb=q[4];
				rb=q[5];
				l=Math.sqrt((xb-xa)*(xb-xa)+(yb-ya)*(yb-ya));
				if(ra<rb){p=rb-ra;}
				else{p=ra-rb;}
				if((ra+rb)<l){
					ans[i]=0;
				}else if(p<=l &&l<=(ra+rb)){
					ans[i]=1;
				}else if(ra>rb){
					ans[i]=2;
				}else{
					ans[i]=-2;
				}
				System.out.println(ans[i]);
			}
		}
	}
}