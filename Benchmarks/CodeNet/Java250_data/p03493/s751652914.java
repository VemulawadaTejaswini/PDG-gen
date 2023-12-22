import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String si = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < si.length(); i++) {
            char s = si.charAt(i);
            if (s == '1') {
                sum++;
            }
        }

        System.out.println(sum);
    }
}
