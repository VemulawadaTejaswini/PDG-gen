import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for(int i=0;i<10;i++){
			a[i]= sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[9]);
		System.out.println(a[8]);
		System.out.println(a[7]);
	}
}