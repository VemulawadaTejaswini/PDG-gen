

import java.util.Scanner;


public class Main {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] ar = new int[n][n];
        for(int i = 0; i<n;i++){
            for(int j = 0; j<n;j++){
                ar[i][j] = 1;
            }
        }
        int count = 0;
        int fig = n * n;
        for(int i = 1;i<=fig;i++){
            int cnt1 = 0;
            int cnt2 = 0;
            int cnt3 = 0;
            int cnt4 = 0;
            int cul = sc.nextInt();
            cul = cul - 1;
            int tate = cul/n;
            int yoko = cul%n;
            ar[tate][yoko] = 0;
            for(int j=0;j<tate;j++){
                if(ar[j][yoko]==1){
                    cnt1++;
                }
            }
            for(int j=tate+1;j<n;j++){
                if(ar[j][yoko]==1){
                    cnt2++;
                }
            }
            for(int j=0;j<yoko;j++){
                if(ar[tate][j]==1){
                    cnt3++;
                }
            }
            for(int j=yoko+1;j<n;j++){
                if(ar[tate][j]==1){
                    cnt4++;
                }
            }
            int min = Math.min(cnt1, cnt2);
            min = Math.min(min, cnt3);
            min = Math.min(min, cnt4);
            count = count + min;
        }
        System.out.println(count);
        sc.close();
    }
}
