import java.util.*;
public class Main{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

	int[] a = new int[30];
	int i,n = 0;
		for(i = 0;i <= 29;i++) {
			n = sc.nextInt();
			a[n-1] = 1;
		}
	for(i = 0;i <= 29;i++) {
		if(a[i] != 1) {
			System.out.println(i +1);
		}
	}
	}
}