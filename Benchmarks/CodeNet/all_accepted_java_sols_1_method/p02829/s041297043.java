import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answers = "123";
        String A = String.valueOf(sc.nextInt());
        String B = String.valueOf(sc.nextInt());
        sc.close();

        answers = answers.replace(A, "").replace(B, "");

        System.out.println(answers);
    }

}