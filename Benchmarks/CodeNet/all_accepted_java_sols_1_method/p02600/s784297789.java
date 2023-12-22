import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        int rank;
        if (x < 600) {
            rank = 8;
        } else if (x < 800) {
            rank = 7;
        } else if (x < 1000) {
            rank = 6;
        } else if (x < 1200) {
            rank = 5;
        } else if (x < 1400) {
            rank = 4;
        } else if (x < 1600) {
            rank = 3;
        } else if (x < 1800) {
            rank = 2;
        } else {
            rank = 1;
        }
        System.out.println(rank);
    }
}
