import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan =new Scanner(System.in);
		
		int n =scan.nextInt();
		int[] b=new int[n];
		for(int i=0;i<n;i++){
			b[i]=scan.nextInt();
		}
		Arrays.sort(b);
		for(int i=0;i<n-1;i++){
			System.out.print(b[i]+" ");
		}
		System.out.println(b[n-1]);
	}
}