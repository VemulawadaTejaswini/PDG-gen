import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int i = 0;
            int k = 0;
            int H = sc.nextInt();
            int W = sc.nextInt();
            if (H == 0 && W == 0) {
                System.out.printf("\n");
                break;
            } 
            while (true) {
                    if (i >= H) {
                        System.out.printf("\n");
                        break;
                    }
                    System.out.printf("#");
                    k++;
                    if (k >= W){
                        System.out.printf("\n");
                        k = 0;
                        i++;
                    }
                    if (i >= H) {
                        System.out.printf("\n");
                        break;
                    }
                    System.out.printf(".");
                    k++;
                    if (k >= W){
                        System.out.printf("\n");
                        k = 0;
                        i++;
                    }
                    if (i >= H) {
                        System.out.printf("\n");
                        break;
                    }
                }
        }
        sc.close();
    }
}
