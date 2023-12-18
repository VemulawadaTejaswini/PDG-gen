import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(Integer i=3; i<=n; i++) {
            if(i % 3 == 0 || Integer.toString(i).contains("3")) {
                System.out.print(" " + i);
            }
        }
        System.out.print("\n");
    }
}

