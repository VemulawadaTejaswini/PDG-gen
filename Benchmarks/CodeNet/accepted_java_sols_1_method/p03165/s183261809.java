import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s = sc.next(), t = sc.next();
        char[] s1 = s.toCharArray(), t1 = t.toCharArray();
        int[][] f = new int[s1.length + 1][t1.length + 1];
        for(int i = 1; i <= s1.length; i ++){
            for(int j = 1; j <= t1.length; j ++){
                if(s1[i - 1] == t1[j - 1])f[i][j] = f[i - 1][j - 1] + 1;
                else f[i][j] = Math.max(f[i][j - 1],f[i - 1][j]);
            }
        }
        StringBuilder sb = new StringBuilder();
        int x = s1.length - 1, y = t1.length - 1;
        while(f[x + 1][y + 1] > 0){
            if(s1[x] == t1[y]){
                sb.append(s1[x]);
                x--;y--;
            }
            else{
                if(f[x + 1][y + 1] == f[x][y + 1])x--;
                else y--;
            }
        }

//        for(int i = 0; i <= s1.length; i ++){
//            for(int j = 0; j <= t1.length; j ++){
//                System.out.print(f[i][j] + " ");
//            }
//            System.out.println();
//        }
        System.out.println(sb.reverse().toString());
    }
}
