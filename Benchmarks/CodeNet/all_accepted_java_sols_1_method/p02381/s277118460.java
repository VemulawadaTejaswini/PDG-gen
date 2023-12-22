import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		while(n!=0){
			double[] s=new double[n];
			String[] a=br.readLine().split(" ");
			double sum=0;
			for(int i=0;i<n;i++){
				s[i]=Double.parseDouble(a[i]);
				sum+=s[i];
			}
			double m=sum/n;
			double v=0;
			for(int i=0;i<n;i++){
				v+=Math.pow(s[i]-m, 2);
			}
	        System.out.printf("%.8f%n", Math.sqrt(v/n));
	        n=Integer.parseInt(br.readLine());
		}
	}
}