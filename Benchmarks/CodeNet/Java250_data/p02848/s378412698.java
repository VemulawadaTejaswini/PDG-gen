import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        for (int i = 0; i < s.length(); i++){
            System.out.print((char) ((s.charAt(i) - 65 + n) % 26 + 65));
        }
        System.out.println();

    }
}
