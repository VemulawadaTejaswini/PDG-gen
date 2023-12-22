import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[3];
        
        for (int i=0; i<3; i++) {
            a[i] = scanner.nextInt();
            
            if (a[i] < 1 || a[i] > 13) return;
        }

        if (a[0] + a[1] + a[2] >= 22)
            System.out.println("bust");
        else System.out.println("win");
    }
}