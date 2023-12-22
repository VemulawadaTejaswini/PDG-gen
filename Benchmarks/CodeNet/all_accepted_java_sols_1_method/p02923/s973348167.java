import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[]counta=new int[n];
		int count=0;
		int []block=new int[n];
		for(int i=0;i<n;i++){
			block[i]=scan.nextInt();
			if(0<i){
				if(block[i]<=block[i-1]){
					count++;
				}else{
					counta[i]=count;
					count=0;
				}
			}
			if(i==n-1){
				counta[i]=count;
			}
		}
		Arrays.sort(counta);
		System.out.println(counta[n-1]);
	}
}
