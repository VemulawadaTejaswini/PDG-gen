import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int[] d = new int[4];
        for (int i = 0; i < s.length; i++) {
            if (s[i] == 'N')
                d[0]++;
            if (s[i] == 'W')
                d[1]++;
            if (s[i] == 'S')
                d[2]++;
            if (s[i] == 'E')
                d[3]++;
        }
        if ((d[0] == 0 && d[2] != 0) || (d[0] != 0 && d[2] == 0) || (d[1] == 0 && d[3] != 0)
                || (d[1] != 0 && d[3] == 0)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

}
