import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = scan.nextInt();
        }

        Arrays.sort(a);
        boolean s = true;
        for (int i = 0; i < a.length; i++) {
            if(i != a[i]){
                System.out.println(i);
                s = false;
                break;
            }
        }

        if(s) System.out.println(5);
    }
}