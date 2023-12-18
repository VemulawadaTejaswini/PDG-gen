import java.util.Scanner;

/**
 * @Author: zhengtiantian
 * @Date: 19-3-28 下午3:58
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int[] number = new int[n];
            for (int i = 0; i < n; i++) {
                number[i] = cin.nextInt();
                if (i == n -1) {
                    System.out.println(number[i]);
                    break;
                }
                System.out.print(number[i]+ " ");
            }
            // 枚举未排序
            for (int i = 1; i < n; i++) {
                int v = number[i];
                int j = i - 1;
                // 从已排序的集合中寻找空位插空
                while (j >= 0) {
                    if (number[j] > v) {
                        number[j + 1] = number[j];
                    } else {
                        break;
                    }
                    j--;
                }
                number[j + 1] = v;
                for (int z = 0; z < n; z++) {
                    if (z == n - 1) {
                        System.out.print(number[z]);
                        break;
                    }
                    System.out.print(number[z] + " ");
                }
                System.out.println();
            }

        }
    }

}

