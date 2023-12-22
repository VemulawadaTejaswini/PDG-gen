import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next() + " ";
        int counter = 0;
        for (int i = 0; i <= N - 3; i++) {
            if (S.substring(i, i + 3).equals("ABC") == true) {
                counter++;
            }
        }
        System.out.println(counter);
        sc.close();
    }
}