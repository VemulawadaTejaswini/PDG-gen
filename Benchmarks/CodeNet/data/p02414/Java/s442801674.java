import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] data = sc.nextLine().split(" ");
        int n = Integer.parseInt(data[0]);
        int m = Integer.parseInt(data[1]);
        int l = Integer.parseInt(data[2]);

        int[][] listA = new int[n][m];
        int[][] listB = new int[l][m];
        for(int i = 0; i < n; i++){
            String[] strTmp = sc.nextLine().split(" ");
            for(int j = 0; j < m;j++){
                listA[i][j]=Integer.parseInt(strTmp[j]);
            }
        }
        
        for(int i = 0; i < m; i++){
            String[] strTmp = sc.nextLine().split(" ");
            for(int j = 0; j < l;j++){
                listB[j][i]=Integer.parseInt(strTmp[j]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < l;j++){
                long tmp = 0;
                for(int k = 0; k < m;k++){
                    tmp+=listA[i][k]*listB[j][k];
                }
                if(j==l-1) sb.append(tmp);
                else sb.append(tmp+" ");
            }
            sb.append("\n");
        }       
        System.out.print(sb);
    }
}
