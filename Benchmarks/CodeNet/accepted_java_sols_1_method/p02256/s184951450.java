import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        int second = in.nextInt();
        if (first == second) {
            System.out.println(first);
        } else {
            for (int i = Math.min(first,second) / 2; i >= 2; i--){
                if (first % i == 0 && second % i == 0) {
                    System.out.println(i);
                    break;
                }
                if (i == 2) {
                    System.out.println(1);
                }
            }
        }
    }
}
