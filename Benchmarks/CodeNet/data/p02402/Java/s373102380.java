import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int seisu = scanner.nextInt();
    	int a[] = new int [seisu];
    	long sum = 0;
    	for(int i = 0;i < seisu;i++){
    		a[i] = scanner.nextInt();
    		sum = sum + a[i];
    	}
    	Arrays.sort(a);
    	System.out.print(a[0]+ " " + a[a.length - 1] + " " +sum);
    	System.out.println();
	}
}
