import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String h = "2019/04/30";
        if (s.compareTo(h) == 1) {
            System.out.println("TBD");
        } else {
            System.out.println("Heisei");
        }
    }
}