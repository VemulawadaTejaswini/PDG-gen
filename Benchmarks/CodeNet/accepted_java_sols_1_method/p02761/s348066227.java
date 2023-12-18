import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] s = new int[m];
        int[] c = new int[m];
        int[][] a = new int[n+1][10];
        boolean no = false;
        for(int i = 0; i < m; i++){
            s[i] = Integer.parseInt(sc.next());
            c[i] = Integer.parseInt(sc.next());
            a[s[i]][c[i]]++;
            if(n >= 2 && s[i] == 1 && c[i] == 0){
                no = true;
            }
        }
        
        for(int i = 1; i <= n; i++){
            int b = 0;
            for(int j = 0; j < 10; j++){
                if(a[i][j] > 0){
                    b++;
                }
            }
            if(b >= 2){
                no = true;
            }
        }
        
        if(no){
            System.out.println(-1);
        }else{
            int[] ans = new int[n+1];
            for(int i = 0; i < m; i++){
                ans[s[i]] = c[i];
            }
            if(n >= 2 && ans[1] == 0){
                ans[1] = 1;
            }
            for(int i = 1; i <= n; i++){
                System.out.print(ans[i]);
            }
            System.out.println();
        }
    }
}