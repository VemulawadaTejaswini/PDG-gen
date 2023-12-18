import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0){
            System.out.println(1);
        }
        else if (n == 1){
            System.out.println(1);
        }
        else {
            int f = 0;
            int f1 = 1;
            int f2 = 1;
            for (int i = 2; i <= n; i++){
                f = f1 + f2;
                f2 = f1;
                f1 = f;
            }
            System.out.println(f);
        }
    }
}

