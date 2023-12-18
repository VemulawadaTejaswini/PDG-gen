import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] dictionary = new String[1000000];
        int right = 0;
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            if (input[0] == "insert") {
                dictionary[right] = input[1];
                right++;
            }
            else {
                System.out.println(find(dictionary, right, input[1]) ? "yes" : "no");
            }
        }
    }

    static boolean find(String[] a, int r, String s) {
        for (int i = 0; i < r; i++) {
            if (a[i].equals(s)) {
                return true;
            }
        }
        return false;
    }
}

