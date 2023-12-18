import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            String word = sc.nextLine();
            int size = word.length();
            int cut_length = 2;
            String end2 = word.substring(size - cut_length);
            String end1 = end2.substring(1);

            if (end1.equals("s")) {
                word += "es";

            }else {
                word += "s";
            }
            System.out.println(word);
        }

    }