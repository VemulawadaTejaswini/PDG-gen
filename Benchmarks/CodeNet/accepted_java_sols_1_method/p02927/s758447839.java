import java.util.*;


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		int D = scan.nextInt();
		int count =0;
		int i =0,j=0;
		for ( i=1;i<M+1;i++) {
		for ( j=21;j<D+1;j++) {
			int d1= j/10, d2=j%10;
			if (d1 >=2 && d2 >=2 && d1*d2 == i) {
				count++;
				//System.out.println(i + " " + d1+""+ d2);
			}
		}
		}
		System.out.println(count);
	}
}
		
	