import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0) break;
			Integer[] point = new Integer[n];
			for(int i=0;i<n;++i){
				point[i]=sc.nextInt();
			}
			Arrays.sort(point);
			int dis=10000000;
			for(int i=0;i<n-1;++i){
				if(point[i+1]-point[i]<dis) dis=point[i+1]-point[i];
			}
			System.out.println(dis);
		}
	}
}
