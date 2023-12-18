import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			int[] s = new int[n];
			if(n==0) break;
			for(int i=0;i<n;++i){
				s[i]=sc.nextInt();
			}
			Arrays.sort(s);
			double sum=0;
			for(int i=1;i<n-1;++i){
				sum+=s[i];
			}
			System.out.println((int)(sum/(n-2)));
		}
	}
}

