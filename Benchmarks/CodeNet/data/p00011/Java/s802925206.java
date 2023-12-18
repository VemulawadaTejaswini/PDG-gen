import java.util.*;

class Main {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int n = sc.nextInt();

        int[] member = new int[w];
        for (int m = 0; m < w; m++) {
            member[m] = m;
        }

        for (int t = 0; t < n; t++) {
            String[] bar = sc.next().split(",");
            int a = Integer.parseInt(bar[0]) - 1;
            int b = Integer.parseInt(bar[1]) - 1;

            int tmp = member[b];
            member[b] = member[a];
            member[a] = tmp;
        }

        for (int m = 0; m < w; m++) {
            System.out.println(member[m] + 1);
        }
    }
}