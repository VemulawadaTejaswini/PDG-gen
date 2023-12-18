import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int min = 1000000000;
        for (int i = 0; i < s.length() - 2; i++) {
            int tmp = Integer.parseInt(s.substring(i, i + 3));
            int diff = Math.abs(753 - tmp);
            if (diff < min) {
                min = diff;
            }
        }
        System.out.println(min);
    }
}