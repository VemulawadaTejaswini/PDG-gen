import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = sc.next().toCharArray();

        int red = 0;
        int blue = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'R') {
                red++;
            }  else {
                blue++;
            }
        }
        System.out.println(red > blue ? "Yes" : "No");
    }
}
