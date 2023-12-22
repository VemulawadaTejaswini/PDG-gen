import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        long n = scan.nextLong();

        StringBuilder name = new StringBuilder();
        int surplus;
        for (; n > 0; n = (n - 1) / 26) {
            surplus = (int) ((n - 1) % 26);
            name.append((char) (surplus + 'a'));
        }
        
        for (int i = name.length(); i > 0; --i) {
            System.out.print(name.charAt(i - 1));
        }
    }
}