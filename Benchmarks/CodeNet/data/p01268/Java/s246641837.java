
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int[] prime;
	static int[] Prime(int[] prime) {
		int k = 0;
		for(int i=2;i<150000;i++) {
			boolean is = true;
			for(int j=2;j*j<=i;j++) {
				if(i%j==0)is = false;
			}
			if(is) {
				prime[k]=i;
				k++;
			}
		}
		return prime;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		prime =  new int[1000001];
		prime = Prime(prime);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int p = sc.nextInt();
			if(n+p==-2)break;
			
			List<Integer> res = new ArrayList<Integer>();
            int f=0;
            while(prime[f]<=n)f++;
            for(int i=f;i<f+p;i++)for(int j=i;j<f+p;j++)res.add(prime[i]+prime[j]);
            Collections.sort(res);
            System.out.println(res.get(p-1));
		}
	}
}



