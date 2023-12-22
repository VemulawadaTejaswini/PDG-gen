import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int min = 1000;
        int max = 0;
        for (int i = 0 ; i < N ; i++ ) {
            int a = sc.nextInt();
            min = Math.min(min, a);
            max = Math.max(max, a);
        }
        System.out.println(max - min);
    }

}