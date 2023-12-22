import java.util.*;
public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int l = Integer.parseInt(sc.next());
        
        //n行m列の行列A
        long[][] list_a = new long[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                list_a[i][j] = Integer.parseInt(sc.next());
            }
        }
        
        //m行l列の行列B
        long[][] list_b = new long[m][l];
        for(int i=0; i<m; i++){
            for(int j=0; j<l; j++){
                list_b[i][j] = Integer.parseInt(sc.next());
            }
        }
        
        //n行l列の行列C
        long[][] list_c = new long[n][l];
        for(int i=0; i<n; i++){
            for(int j=0; j<l; j++){
                for(int k=0; k<m; k++){
                    list_c[i][j] += list_a[i][k] * list_b[k][j];
                }
            }
        }
        
        //出力
        for(int i=0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<l; j++){
                sb.append(list_c[i][j]);
                sb.append(" ");
            }
            sb.deleteCharAt(sb.lastIndexOf(" "));
            System.out.println(sb);
        }
    }

}

