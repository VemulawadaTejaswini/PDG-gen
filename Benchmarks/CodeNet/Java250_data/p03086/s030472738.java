import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        int max = 0;
        for (char c : s.toCharArray()) {
            if (c == 'A' || c == 'C' || c == 'G' || c == 'T') {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }
      	max = Math.max(max, count);
        System.out.println(max);
    }
}
