import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] S = new String[3];
        String[] T = new String[3];
        String line;

        line = sc.nextLine();
        S = line.split("");

        line = sc.nextLine();
        T = line.split("");

        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (S[i].equals(T[i])) {
                count++;
            }
        }
        System.out.println(count);
    }
}