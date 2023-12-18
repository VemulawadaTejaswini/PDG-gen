import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int an[] = new int[100];
        int n = input.nextInt();
        for(int i = 0; i < n; i++) {
            an[i] = input.nextInt();
        }

        for(int i = n - 1; i >= 1; i--){
            System.out.printf("%d ", an[i]);
        }
        System.out.printf("%d\n", an[0]);
    }
}
