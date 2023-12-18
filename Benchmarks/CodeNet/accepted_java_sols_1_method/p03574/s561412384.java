import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        String [][] s = new String[H+2][W+2];
        int [][] t = new int[H+2][W+2];

        for(int i = 1 ; i <= H  ; i++){
            String[] str = sc.next().split("");
            for(int j = 1 ; j <= W ; j++){
                s[i][j] = str[j-1];
                t[i][j] = 0;
            }
        }

        for(int i = 1 ; i <= H  ; i++){
            for(int j = 1 ; j <= W ; j++){
                if(s[i][j].equals("#")){
                    t[i-1][j-1]++;
                    t[i-1][j]  ++;
                    t[i-1][j+1]++;
                    t[i][j-1]  ++;
                    t[i][j+1]  ++;
                    t[i+1][j-1]++;
                    t[i+1][j]  ++;
                    t[i+1][j+1]++;
                }
//                System.out.println(t[i][j]);
            }
        }

        for(int i = 1 ; i <= H  ; i++){
            for(int j = 1 ; j <= W ; j++){
                if(s[i][j].equals(".")){
                    s[i][j] = String.valueOf(t[i][j]);
                }
                System.out.print(s[i][j]);
            }
            System.out.println("");
        }
    }
}