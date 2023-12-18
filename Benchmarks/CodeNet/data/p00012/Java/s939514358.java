import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		double[][] p=new double[4][2];
		double[] s=new double[2];
		int a,b,c;
		String t = "";
		String[] d = new String[8];
		while((t=bf.readLine())!=null){
			if(t.length()<=0)break;
			d=t.split(" ");
			for(int i=0;i<4;i++)for(int j=0;j<2;j++)p[i][j]=Double.parseDouble(d[i*2+j]);
			for(int i=0;i<3;i++){
				a=i;
				b=(a+1)%3;
				c=(b+1)%3;
				s[0]=(p[a][0]-p[b][0])*(p[c][1]-p[a][1])+(p[a][1]-p[b][1])*(p[a][0]-p[c][0]);
				s[1]=(p[a][0]-p[b][0])*(p[3][1]-p[a][1])+(p[a][1]-p[b][1])*(p[a][0]-p[3][0]);
				if(s[0]*s[1]<0.0){System.out.println("NO");break;}
				if(i==2)System.out.println("YES");
			}
		}
	}
}