import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int r = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        
        int[][] list = new int[r+1][c+1];
        
        //標準入力
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                list[i][j] = Integer.parseInt(sc.next());
            }
        }
        //r+1行目
        for(int i=0; i<c; i++){
            int sum=0;
            for(int j=0; j<r; j++){
                sum += list[j][i];
            }
            list[r][i] = sum;
        }
        //c+1列目
        for(int i=0; i<r+1; i++){
            int sum=0;
            for(int j=0; j<c; j++){
                sum += list[i][j];
            }
            list[i][c] = sum;
        }
        
        //出力
        for(int i=0; i<r+1; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<c+1; j++){
                sb.append(list[i][j]).append(" ");
            }
            sb.deleteCharAt(sb.lastIndexOf(" "));
            System.out.println(sb);
        }

    }

}

