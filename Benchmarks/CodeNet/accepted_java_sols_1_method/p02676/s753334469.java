import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();

        String word = sc.next();

        if (word.length()>K) {
            word = word.substring(0, K);
            System.out.println(word + "...");
        }else {
            System.out.println(word);
        }
    }
}
