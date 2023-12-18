import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("\\D+");

		int w = scan.nextInt();
		int n = scan.nextInt();
		
		int[] a = new int[w];
		for(int i=0;i<w;i++)
			a[i] = i+1;
		
		for(int i=0;i<n;i++) {
			int x = scan.nextInt()-1;
			int y = scan.nextInt()-1;
			
			int t = a[x];
			a[x] = a[y];
			a[y] = t;
		}
		
		for(int i=0;i<w;i++){
			System.out.println(a[i]);
		}
		
		scan.close();
	}
}