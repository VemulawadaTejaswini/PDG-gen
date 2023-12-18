import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] dictionary = new String[1000000];
        int right = 0;
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            if (input[0] == "input") {
                dictionary[right] = input[1];
                right++;
            }
            else {
                System.out.println(find(dictionary, right, input[1]) ? "yes" : "no");
            }
        }
    }
    
    static boolean find(String[] a, int r, String s) {
        a[r] = s;
        int i = 0;
        while (!a[i].equals(s)) {
            i++;
        }
        if (i == r) {
            return false;
        }
        return true;
    }
}

