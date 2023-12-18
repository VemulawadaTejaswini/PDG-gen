import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
	int N = Integer.parseInt(reader.readLine());
	int[] factors = new int[N+1];
	factors[1] = 1;
	long result = 1;
	for(int i = 2;i<=N;i++){
		int res = 1;
		int p = i;
		boolean calculated = false;
		for(int j = 2;j*j<=i;j++){
			if(factors[i]!= 0){
				res *= factors[i];
				calculated = true;
				break;
			}
			else if(i%j==0){
				int dum = 0;
				while(i%j==0){
					i/=j;
					dum++;
				}
				res*=(dum+1);	
			}
		}
		if(i!=1 && !calculated){ res*=2;}
		//factors[p] = res;
		i=p;
		//System.out.println("no of factor of"+p+" "+factors[p]+" "+p*res);
		result += (p*res);
	}
		System.out.println(result);
	}
}
