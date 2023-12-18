import java.io.*;
import java.math.*;
import java.util.*;

public class Main0279{
	public static void main(String[] args) throws IOException{
		Scanner r = new Scanner(System.in);
		int N;
		int total;
		int zero;
		int flag;
		while(r.hasNext()){
			N = r.nextInt();
			if(N == 0)break;
			int[] gatya = new int[N];
			total = 0;
			zero = 0;
			flag = 0;
			for(int i=0;i<N;i++){
				gatya[i] = r.nextInt();
				if(gatya[i] == 0) zero++;
				if(gatya[i] >= 2) flag=1;
			}
			if(flag == 0) System.out.println("NA");
			else System.out.println(N-zero+1);
		}
	}
}