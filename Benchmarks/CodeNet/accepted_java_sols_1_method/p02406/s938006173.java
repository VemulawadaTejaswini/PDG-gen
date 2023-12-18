import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 || i % 10 == 3 || i >= 30 && i < 40 || i % 100 >= 30 && i % 100 <= 39 || i % 1000 >= 300 && i % 1000 <= 399 || i % 10000 >= 3000 && i % 10000 <= 3999) System.out.print(" " + i);
        }
        System.out.println();
    }
}
