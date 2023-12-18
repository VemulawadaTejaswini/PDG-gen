import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		while(n!=0){
			int[] s=new int[n];
			String[] a=br.readLine().split(" ");
			int sum=0;
			for(int i=0;i<n;i++){
				s[i]=Integer.parseInt(a[i]);
				sum+=s[i];
			}
			int m=sum/n;
			int v=0;
			for(int i=0;i<n;i++){
				v+=Math.pow(s[i]-m, 2);
			}
	        System.out.printf("%.8f%n", Math.sqrt(v/n));
	        n=Integer.parseInt(br.readLine());
		}
	}
}