import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (in.hasNext()) {
            int n = in.nextInt();
            int x = in.nextInt();

            if (n == 0) {
                break;
            }

            int ret = 0;
            int n3min = x / 3;
            for (int n3 = n; n3 >= n3min; n3--) {
                int x2 = x - n3;
                int n2 = n3 - 1;

                int max = (x2 - 1) / 2;
                int hosei = x2 - 1 - n2;
                max -= (hosei > 0) ? hosei : 0;

                ret += (max < 0) ? 0 : max;
            }

            sb.append(ret).append("\n");
        }

        System.out.print(sb.toString());
    }
}