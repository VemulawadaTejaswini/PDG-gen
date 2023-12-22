import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= s.length()-3; i++) {
            int num = Integer.parseInt(s.substring(i, i+3));
            min = Math.min(min, Math.abs(num - 753));
        }
        System.out.println(min);
    }
}
