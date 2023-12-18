import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		String[] d = new String[6];
		double[] p = new double[7];
		int n=Integer.parseInt(bf.readLine());
		while(n-->0){
			d=bf.readLine().split(" ");
			for(int i=0;i<6;i++)p[i]=Double.parseDouble(d[i]);
			p[6]=Math.sqrt((p[0]-p[3])*(p[0]-p[3])+(p[1]-p[4])*(p[1]-p[4]));
			if(p[6]>p[2]+p[5]){
				System.out.println("0");
			}else if(p[2]-p[5]>p[6]){
				System.out.println("2");
			}else if(p[5]-p[2]>p[6]){
				System.out.println("-2");
			}else{
				System.out.println("1");
			}
		}
	}
}