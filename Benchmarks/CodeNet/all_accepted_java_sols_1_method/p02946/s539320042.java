import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();
        for(int i=0; i<k*2-1; i++) {
            int a = x - k + 1 + i;
            System.out.print(a + " ");
        }
        System.out.println();
    }
}