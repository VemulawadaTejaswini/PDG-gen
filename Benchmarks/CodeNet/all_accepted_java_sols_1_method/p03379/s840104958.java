import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] X = new int[sc.nextInt()];
        sc.nextLine();
        for (int i = 0; i < X.length; i++) {
        	X[i] = sc.nextInt();
        }
        
        int[] sortX = X.clone();
        
        Arrays.sort(sortX);
        
        if (X.length == 2) {
        	System.out.println(sortX[1]);
        	System.out.println(sortX[0]);
        	return;
        }
        
        int harf = sortX[X.length / 2];
        int under = sortX[X.length / 2 - 1];
        for (int i = 0; i < X.length; i++) {
        	if (harf > X[i]) {
        		System.out.println(harf);
        	} else {
        		System.out.println(under);
        	} 
        }
    }
}
