import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt();
        int[][] a = new int[h+2][w+2];
        Arrays.fill(a[0], 0);
        Arrays.fill(a[h+1], 0);
        for(int i = 1; i < h+1; i++){
            a[i][0] = 0;
            a[i][w+1] = 0;
            String s = sc.next();
            for(int j = 1; j < w+1; j++){
                char c = s.charAt(j-1);
                if(c == '#') a[i][j] = 1;
                else if(c== '.') a[i][j] = 0;
            }
        }
        int[][] cnt = new int[h+1][w+1];
        for(int i = 1; i < h+1; i++){
            for(int j = 1; j < w+1; j++){
                if(a[i-1][j] == 1) cnt[i][j]++;
                if(a[i+1][j] == 1) cnt[i][j]++;
                if(a[i][j-1] == 1) cnt[i][j]++;
                if(a[i][j+1] == 1) cnt[i][j]++;
                if(a[i-1][j-1] == 1) cnt[i][j]++;
                if(a[i-1][j+1] == 1) cnt[i][j]++;
                if(a[i+1][j-1] == 1) cnt[i][j]++;
                if(a[i+1][j+1] == 1) cnt[i][j]++;
                if(a[i][j] == 0) System.out.print(cnt[i][j]);
                else System.out.print('#');
            }
            System.out.print("\n");
        }
    }
}