import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        if (S.contains("R")) {
            if (S.charAt(1) == 'S') {
                System.out.println(1);
            } else {
                if (S.equals("RRR")) {
                    System.out.println(3);
                } else if (S.equals("SRS")) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            }
        } else {
            System.out.println(0);
        }
    }
}