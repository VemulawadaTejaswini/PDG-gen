import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] antenna = new int[5];
        for (int i = 0; i < 5; i++) {
            antenna[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        String ans = "Yay!";
        x: for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - j; j++) {
                if (Math.abs(antenna[i] - antenna[j]) > k) {
                    ans = ":(";
                    break x;
                }
            }
        }
        System.out.println(ans);
    }
}
