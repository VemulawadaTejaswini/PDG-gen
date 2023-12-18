
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int a = 1;
        while(a <= n){
            String str = String.valueOf(a);
            if (a % 3 == 0 || str.indexOf("3") != -1){
                System.out.print(" ");
                System.out.print(a);
            }
            a++;
        }
//        System.out.print(" ");
        System.out.println();
    }

}

