import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String[] sx=br.readLine().split(" ");
		String[] sy=br.readLine().split(" ");
		double[] x=new double[n];
		double[] y=new double[n];
		for (int i=0;i<n;i++){
			x[i]=Double.parseDouble(sx[i]);
			y[i]=Double.parseDouble(sy[i]);
		}
		System.out.printf("%.6f\n",manDis(x,y,n));
		System.out.printf("%.6f\n",eucDis(x,y,n));
		System.out.printf("%.6f\n",mincoDis(x,y,n));
		System.out.printf("%.6f\n",cheDis(x,y,n));
	}
	public static double manDis(double x[],double y[],int n){
		double manD=0;
		for(int i=0;i<n;i++){
			manD +=Math.abs(x[i]-y[i]);
		}
		return manD;
	}

	public static double eucDis(double x[],double y[],int n){
		double eucD=0;
		for(int i=0;i<n;i++){
			eucD +=(x[i]-y[i])*(x[i]-y[i]);
		}
		return Math.sqrt(eucD);
	}

	public static double mincoDis(double x[],double y[],int n){
		double mincoD=0;
		for(int i=0;i<n;i++){
			mincoD +=Math.pow(Math.abs(x[i]-y[i]),3);
		}
		return Math.cbrt(mincoD);
	}

	

	public static double cheDis(double x[],double y[],int n){
		double cheD,maxD=0;
		for(int i=0;i<n;i++){
			cheD =Math.abs(x[i]-y[i]);
			if(cheD>maxD) maxD=cheD;
		}
		return maxD;
	}
	
}