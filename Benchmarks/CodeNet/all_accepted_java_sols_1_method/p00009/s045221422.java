import java.io.*;

public class Main {
	public static void main(String [] args) throws IOException{
		boolean [] a=new boolean [1000000];
		int [] prime=new int [1000000];
		int cnt=0;
		for (int i=0;i<1000000;i++){
			a[i]=true;
		}
		a[0]=false;
		a[1]=false;
		prime[0]=0;
		prime[1]=0;
		for (int i=2;i<1000000;i++){
			if (a[i]==true){
				cnt++;
				int j=2*i;
				while (j<1000000){
					a[j]=false;
					j+=i;
				}
			}
			prime[i]=cnt;
		}
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		while ((str=br.readLine())!=null){
			System.out.println(prime[Integer.parseInt(str)]);
		}
	}
}