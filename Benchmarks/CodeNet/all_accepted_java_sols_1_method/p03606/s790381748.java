import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),ans = 0;
        int[][] list = new int[a][2];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 2; j++) {
                list[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < a; i++) {
            ans += list[i][1]-list[i][0]+1;
        }
        System.out.println(ans);

    }
}