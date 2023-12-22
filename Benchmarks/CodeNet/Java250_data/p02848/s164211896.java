import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char[] cA = sc.next().toCharArray();

        for (int i = 0; i < cA.length; i++) cA[i] = (char) (((N + cA[i]) % 65 % 26 + 65));

        for (char c : cA) System.out.print(c);
    }
}