import java.util.Scanner;

class Main{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int s = scan.nextInt();
            if (x == 0 && y == 0 && s == 0) {
                break;
            }
            int[] data = {x + 100, y + 100, s};
            System.out.println(doMoney(data));
        }
    }

    private static int doMoney(int[] data) {
        int max = -1;
        for (int i = 1; i <= data[2] / 2; i++) {
            int[] old = new int[2];
            old[0] = i;
            old[1] = data[2] - i;
            System.out.println("i=" + i + ":" + old[1]);
            for (int j = 0; j < 2; j++) {
                int temp = old[j];
                old[j] = old[j] * 100 / data[0];
                while (true) {
                    int hoge = old[j] * data[0] / 100;
                    if (hoge == temp) {
                        break;
                    } else if (hoge > temp) {
                        old[j]--;
                        break;
                    }
                    old[j]++;
                }
                old[j] = old[j] * data[1] / 100;
            }
            System.out.println("**old[0]=" + old[0] + ":old[1]=" + old[1]);
            if (max < (old[0] + old[1])) {
                max = (old[0] + old[1]);
            }
            System.out.println(">>max=" + max + ":temp=" + (old[0] + old[1]));
        }
        return max;
    }
}
