import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        final String week = "SUNMONTUEWEDTHUFRISAT"; 

        try (Scanner sc = new Scanner(System.in)) {
            String S = sc.next();
            int result = week.indexOf(S);
            if (result == 0) {
                System.out.println(7);
            } else {
                result = 7 - (result / 3);
                System.out.println(result);
            }
        }
    }
}