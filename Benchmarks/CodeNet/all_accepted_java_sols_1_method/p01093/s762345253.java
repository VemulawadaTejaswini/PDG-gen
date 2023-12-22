import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0) break;
			int[] data = new int[n];
			for(int i=0;i<n;++i){
				data[i]=sc.nextInt();
			}
			Arrays.sort(data);
			int min=1000000;
			for(int i=n-1;i>0;--i){
				int num=data[i]-data[i-1];
				if(min>num) min=num;
			}
			System.out.println(min);
		}
	}
}
