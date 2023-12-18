import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] d=new int[n];
		for(int i=0; i<n; i++){
			d[i]=sc.nextInt();
		}
		Arrays.sort(d);
		System.out.println(d[n/2]-d[n/2-1]);
	}
}


