import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] x = new int[10];
        for (int i = 0;i <= 9;i++){
            x[i] = scan.nextInt();
        }
        
        Arrays.sort(x);
        
        System.out.println(x[9]);
        System.out.println(x[8]);
        System.out.println(x[7]);
    }
}