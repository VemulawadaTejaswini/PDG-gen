import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int ab[] = new int[3];
        ab[0] = a * b;
        ab[1] = a + b;
        ab[2] = a - b;
        
        Arrays.sort(ab);
        
        System.out.println(ab[2]);
    }
}
