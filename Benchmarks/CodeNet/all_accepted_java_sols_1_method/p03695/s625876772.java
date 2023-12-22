import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] a = new int[9];
		for(int i=0 ; i<n;i++) {
			int x = stdIn.nextInt();
			if(x/400<=7) {
				a[x/400]++;
			}
			else {
				a[8]++;
			}
		}
		int i=0;
		int range = 0;
		while(i<8) {
			if(a[i++]>0) {
				range++;
			}
		}
		int min = range;
		int max = range + a[8];
		if(range==0) {
			min = 1;
			max = a[8];
		}
		System.out.println(min+" "+max);
	}
}
