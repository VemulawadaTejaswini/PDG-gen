import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while(null != (s = in.readLine())){
			String[] arr = s.split(" ",0);
			double[] iarr = toDoubleArray(arr);
			calc(iarr);
		}
	}
	private static double[] toDoubleArray(String[] arr){
		double[] result = new double[arr.length];
		for(int i=0;i<arr.length;i++)
			result[i] = Integer.parseInt(arr[i]);
		return result;
	}
	private static void calc(double[] arr){
		double det = arr[0]*arr[4]-arr[1]*arr[3];
		double x = (arr[2]*arr[4]-arr[1]*arr[5])/det;
		double y = (-arr[2]*arr[3]+arr[0]*arr[5])/det;
		if(x==-0)x=0.0;
		if(y==-0)y=0.0;
		System.out.printf("%.3f %.3f\n",x,y);
	}
}