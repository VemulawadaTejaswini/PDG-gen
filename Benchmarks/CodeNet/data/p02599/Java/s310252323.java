import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] c = new int[n];
        int[][] a = new int[2][q];
        for(int i = 0 ; i < n ; i++){
            c[i] = sc.nextInt();
        }
        for(int i = 0 ; i < q ; i++){
            for(int k = 0 ; k < 2 ; k++){
                a[k][i] = sc.nextInt() - 1;
            }
        }
        sc.close();
        for(int i = 0 ; i < q ; i++){
            int[] s = new int[a[1][i] - a[0][i] + 1];
            for(int k = a[0][i] ; k <= a[1][i] ; k++){
                s[k - a[0][i]] = c[k];
            }
            Arrays.sort(s);
            int yono = 1;
            for(int k = 0 ; k < a[1][i] - a[0][i] ; k++){
                if(s[k] != s[k + 1]){
                    yono++;
                }
            }
            System.out.println(yono);
        }
    }
}