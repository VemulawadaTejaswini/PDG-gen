

import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            int k = sc.nextInt();
            if (n==0) break;
            int[] amountInFridge = new int[k];
            int[][] amountNeed = new int[n][k];
            boolean isEnough = true;

            for(int i =0; i<k; i++){
                amountInFridge[i] = sc.nextInt();
            }

            for (int i=0; i<n; i++){
                for(int j=0; j<k; j++){
                    amountNeed[i][j] = sc.nextInt();
                }
            }


            OUT: for (int j =0 ; j<k; j++){
                int sum = amountNeed[0][j];
                for (int i=1; i<n; i++){
                    sum+= amountNeed[i][j];
                    if (sum > amountInFridge[j]) {
                        isEnough = false;
                        break OUT;
                    }

                }
            }

            if(isEnough) System.out.println("Yes");
            else System.out.println("No");



        }
    }
}
