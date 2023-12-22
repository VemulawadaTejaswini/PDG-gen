import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int k = sc.nextInt();
        int[] x = {a, b, c, d, e};
        int count = 0;
        
        limit:		
        for (int i = 0; i < x.length; i++) {
        	for (int j = i + 1; j < x.length; j++) {
        		if (x[j] - x[i] > k) {
        			count++;
        			break limit;
        		}
        	}
        }
        
        System.out.println(count == 1 ? ":(" : "Yay!");
	}	
}