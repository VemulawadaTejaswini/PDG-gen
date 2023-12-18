import java.util.Scanner;

public class Sort3num {
    public static int[] sort3(int[] pre) {
        int tmp;
        for (int i = 2; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (pre[j] > pre[j + 1]) {
                    tmp  = pre[j];
                    pre[j] = pre[j + 1];
                    pre[j + 1] = tmp;
                }
            }
        }
        return pre;
    }

    public static void main(String[] args) {
        int[] num = new int[3];
        Scanner scan = new Scanner(System.in);

        num[0] = Integer.parseInt(scan.next());
        num[1] = Integer.parseInt(scan.next());
        num[2] = Integer.parseInt(scan.next());

        num = sort3(num);

        System.out.println(num[0] +" " + num[1] + " " + num[2]);
    }
}

