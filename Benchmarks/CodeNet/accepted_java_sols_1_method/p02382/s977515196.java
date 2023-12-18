import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String[] a=br.readLine().split(" ");
		String[] b=br.readLine().split(" ");
		double l1=0,l2=0,l3=0,l4=0;
		for(int i=0;i<n;i++){
			double x=Double.parseDouble(a[i]);
			double y=Double.parseDouble(b[i]);
			double t=Math.abs(x-y);
	        l1+=t;
	        l2+=Math.pow(t,2);
	        l3+=Math.pow(t,3);
	        l4=Math.max(t,l4);
		}
        System.out.printf("%.6f%n", l1);
        System.out.printf("%.6f%n", Math.sqrt(l2));
        System.out.printf("%.6f%n", Math.cbrt(l3));
        System.out.printf("%.6f%n", l4);
	}
}