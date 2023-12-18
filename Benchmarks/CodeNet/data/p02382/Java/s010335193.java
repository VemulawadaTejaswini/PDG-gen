import java.io.*;

public class Main{
	public static void main(String[] arsg) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		double[] x = new double[count];
		double[] y = new double[count];
		String[] strx = (br.readLine()).split(" ");
		String[] stry = (br.readLine()).split(" ");
		
		
		for(int i = 0;i<count;i++){
			x[i] = Integer.parseInt(strx[i]);
		}
		for(int i = 0;i<count;i++){
			y[i] = Integer.parseInt(stry[i]);
		}
		double sum = 0;
		for(int i = 0;i<count;i++){
			sum +=  Math.abs(x[i] - y[i]);
		}
		System.out.printf("%.6f\n",sum);
		sum = 0;
		for(int i = 0;i<count;i++){
			sum += Math.pow(x[i]-y[i],2);
		}
		System.out.printf("%.6f\n",Math.sqrt(sum));
		sum = 0;
		for(int i = 0;i<count;i++){
			sum += Math.pow(Math.abs(x[i]-y[i]),3);
		}
		double d = Math.cbrt(sum);
		System.out.printf("%.6f\n",d);
		sum = Math.abs(x[0]-y[0]);
		for(int i = 0;i<count;i++){
			sum = Math.max(sum,Math.abs(x[i]-y[i]));
		}
		System.out.printf("%.6f\n",sum);
		
	}
}