import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i, max, min;
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r0 = sc.nextInt();
        int r1 = sc.nextInt();
       
        max = r1 - r0;
        min = Math.min(r0, r1);
        
        for(i = 2; i < n; i++) {
        	int r = sc.nextInt();
        	max = Math.max(max, r-min);
        	min = Math.min(min, r);
        }
        System.out.println(max);
	}
}
