import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			int[] p = new int[n];
			for(int i = 0;i < n;i++){
				p[i] = scan.nextInt();
			}
			Arrays.sort(p);
			long wait = 0;
			for(int i = 0;i < n-1;i++){
				for(int j = 0;j <= i;j++){
					wait += p[j];
				}
			}
			System.out.println(wait);
		}
	}
}