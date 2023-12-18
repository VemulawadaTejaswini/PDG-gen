import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            String word = sc.nextLine();
            System.out.println(multiple(word));
        }

    }

    public static String multiple(String word) {
        for (String s : new String[]{"s"}){
            if (word.endsWith(s)) {
                return word + "es";
            }
        }
        return word + "s";
    }
}