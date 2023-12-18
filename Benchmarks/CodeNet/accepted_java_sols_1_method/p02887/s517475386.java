import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        char[] S = scanner.next().toCharArray();

        int count = 0;
        char tempSlime = 0;
        for (int i=0; i< N; i++) {
            if (S[i] != tempSlime) {
                tempSlime = S[i];
                count++;
            }
        }
        System.out.println(count);
    }
}