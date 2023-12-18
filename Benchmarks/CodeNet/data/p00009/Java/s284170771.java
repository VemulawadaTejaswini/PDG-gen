import java.io.*;
public class Main {
   public static void main(String[] args) throws IOException{
	   int[] prime = new int[1000005];
	   for(int i=2;i<=500000;i++){
		   for(int j=2;i*j<=1000000;j++){
			   prime[i*j] = 1;
		   }
	   }
	   BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	   String s;
	   int n;
	   int cnt;
	   while((s = buf.readLine()) != null){
		   cnt = 0;
		   n = Integer.parseInt(s);
		   for(int i=2;i<=n;i++){
			   if(prime[i] == 0) cnt++;
		   }
		   System.out.println(cnt);
	   }
   }
}