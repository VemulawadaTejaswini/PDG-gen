import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] hon = new int[n + 1][n + 1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                hon[i][j] = -1;
            }
        }

        for(int i = 1; i <= n; i++){
            int num = sc.nextInt();
            for(int j = 0; j < num; j++){
                hon[i][sc.nextInt()] = sc.nextInt();
            }
        }

        int max = 0;
        for(int i = 0; i < (1 << n); i++){
            boolean bl = true;
            for(int j = 0; j < n; j++){
                if((i >> j & 1) == 1){
                    for(int k = 1; k <= n; k++){
                        if(hon[j + 1][k] != -1 && hon[j + 1][k] != (i >> k - 1 & 1)){
                            bl = false;
                            break;
                        }
                    }
                }
                if(!bl){
                    break;
                }
            }
            if(bl){
                max = Math.max(max, Integer.bitCount(i));
            }
        }

        System.out.println(max);
    }
}