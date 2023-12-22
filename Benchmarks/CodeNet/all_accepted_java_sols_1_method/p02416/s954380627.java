import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int[] sum = new int[10000];
        int[] n = new int[1000];
        int i, j;
        String s;

        Scanner sc = new Scanner(System.in);

        for (i = 0; true; i++) {
            sum[i] = 0;
            s = sc.nextLine();
            if (s.equals("0")) break;

            for (j = 0; j < s.length(); j++) {
                n[j] = Character.getNumericValue(s.charAt(j));
                sum[i] += n[j];
            }
        }
        sc.close();

        int I = i;

        for (i = 0; i < I; i++) {
            System.out.println(sum[i]);
        }
    }
}
