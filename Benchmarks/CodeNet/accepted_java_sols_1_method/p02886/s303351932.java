import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int takoyaki[] = new int[n];
		int life = 0;
		for(int i=0;i<n;i++) {
			takoyaki[i] = scan.nextInt();
		}
		
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				life += takoyaki[i] * takoyaki[j];
			}
		}
		
		System.out.println(life);
		
	}

}
