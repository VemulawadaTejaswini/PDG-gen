import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arrayA = new int[a + 1];
        int[] arrayB = new int[a];
        
        for(int i = 0; i < a + 1; i++){
            arrayA[i] = sc.nextInt();
        }
        for(int i = 0; i < a; i++){
            arrayB[i] = sc.nextInt();
        }
        long sum = 0;
        for(int i = 0; i < a; i++){
            long n = Math.min(arrayA[i], arrayB[i]);
            sum += n;
            arrayA[i] -= n;
            arrayB[i] -= n;
            n = Math.min(arrayA[i + 1], arrayB[i]);
            sum += n;
            arrayA[i + 1] -= n;
            arrayB[i] -= n;
        }
        System.out.println(sum);
    }
}
