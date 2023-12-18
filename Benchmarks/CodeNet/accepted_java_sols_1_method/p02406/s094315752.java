import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 3; i < a +1; i++) {
            if(i % 10 == 3) {
                System.out.print(" " + i);
                continue;
            }
            if(i % 3 == 0) {
                System.out.print(" " + i);
                continue;
            }
            if(String.valueOf(i).contains("3")) {
                System.out.print(" " + i);
                continue;
            }
        }
        System.out.println();
    }
}
