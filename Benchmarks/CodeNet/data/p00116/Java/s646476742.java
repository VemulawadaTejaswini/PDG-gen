import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException err){
			err.printStackTrace();
		}
	}

	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> Ans = new ArrayList<Integer>();
		String line;
		String[] d;
		int[][] data;
		int[] a,b;
		int w, h, i, j, s0, xa, xb, x1, ya, s=0;

		while((line = in.readLine()) != null){
			d = line.split(" ");
			h = Integer.parseInt(d[0]);
			w = Integer.parseInt(d[1]);
			if(h==0&&w==0) break;
			data = new int[h+2][w+2];
			a = new int[w+2];
			b = new int[w+2];
			for(i=0;i<w+2;i++){
				a[i]=0;
				b[i]=0;
				data[0][i]=0;
				data[h+1][i]=0;
			}
			for(j=0;j<h;j++){
				data[j][w+1]=0;
			}

			for(j=0;j<h;j++){
				line=in.readLine();
				for(i=0;i<w;i++){
					if(line.substring(i,i+1).equals(".")){
						data[j][i]=1;
					}else{
						data[j][i]=0;
					}
				}
			}
			a[0]=w+1;
			s0=0;
			for(j=1;j<=h;j++){
				xa=0;
				xb=0;
				for(i=0;i<=w;i++){
					x1=i+1;
					if(data[j][x1]==0){
						a[x1]=j;
						b[x1]=0;
						xb=x1;
					}
					else if(b[x1]<xb){
						b[x1]=xb;
					}
					if(data[j+1][i]==0)xa=i;
					if(a[xa]<a[x1]){
						while(a[xa]<a[x1]){
							ya=a[xa];
							xa=b[xa];
							s=(j-ya)*(i-xa);
							if(s>s0){
								s0=s;
							}
						}
					}
				}
			}
			Ans.add(s0);
		}

		for(i=0; i<Ans.size(); i++){
			System.out.println(Ans.get(i));
		}
	}
}