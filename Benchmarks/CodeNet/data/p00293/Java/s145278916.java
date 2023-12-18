import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] n = new int[sc.nextInt() / 2];
		int[] v = new int[sc.nextInt() / 2];
		int[] x = new int[n.length + v.length];
		
		for(int i = 0; i < n.length; i++){
			n[i] = (sc.nextInt() * 60) + sc.nextInt();
			x[i] = n[i];
		}
		for(int i = 0; i < v.length; i++){
			v[i] = (sc.nextInt() * 60) + sc.nextInt();
			x[i + n.length] = v[i];
		}
		Arrays.sort(x);
		
		for(int i = 0; i < x.length; i++){
			System.out.printf("%d:%d", x[i]/60, x[i]%60);
			if(i != x.length - 1)
				System.out.print(" ");
			else
				System.out.println();
		}
		sc.close();
	}
}