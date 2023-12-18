import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        
        for (int i = n - 1; i > -1; i--) {
            if (i == 0) {
                System.out.println(array[i]);
            }
            else {
                System.out.print(array[i] + " ");
            }
        }
    }
}
