import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String S = scanner.nextLine();

        // 注目したリーダーの
        // 左側に存在する'W'のの数 + 右側に存在する'E'
        // が向く方向を変える人数
        int[] sum_e = new int[N];
        int[] sum_w = new int[N];

        // 左側に存在する合計
        int num_e = 0;
        int num_w = 0;

        for (int n = 0; n < N; n++) {
            sum_e[n] = num_e;
            sum_w[n] = num_w;

            if (S.charAt(n) == 'E') {
                num_e++;
            }
            if (S.charAt(n) == 'W') {
                num_w++;
            }
        }

        int min_num = N;
        for (int n = 0; n < N; n++) {
            int num = sum_w[n] + num_e - sum_e[n];
            if (S.charAt(n) == 'E') {
                num--;
            }

            if (num < min_num) {
                min_num = num;
            }
        }
        
        System.out.println(min_num);
    }
}
