import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		int[][] f = new int[10][10];int[] c={0,1,2,4},p=new int[3];int n=0,m=0;
		String t;String[] d;
		for(int i=0;i<10;i++)for(int j=0;j<10;j++)f[i][j]=0;
		while((t=bf.readLine())!=null){
			d=t.split(",");
			for(int i=0;i<3;i++)p[i]=Integer.parseInt(d[i]);
			for(int i=0;i<10;i++)
				for(int j=0;j<10;j++)
					if((j-p[0])*(j-p[0])+(i-p[1])*(i-p[1])<=c[p[2]])f[i][j]++;
		}
		for(int i=0;i<10;i++)for(int j=0;j<10;j++){
			if(m<f[i][j])m=f[i][j];
			if(f[i][j]==0)n++;
		}
		System.out.println(n);
		System.out.println(m);
	}
}