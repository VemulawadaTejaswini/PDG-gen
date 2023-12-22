import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int shift = scanner.nextInt();
        scanner.nextLine();

        char[] alphabets = scanner.nextLine().toCharArray();

        for (int i=0; i<alphabets.length; i++) {
            alphabets[i] += shift;
            if (alphabets[i] > 'Z') alphabets[i] -= 26;
        }

        System.out.println(alphabets);
    }
}
