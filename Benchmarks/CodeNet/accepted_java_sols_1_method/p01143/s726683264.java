

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
           //BigDecimal p = new BigDecimal(100- scanner.nextInt()).divide(BigDecimal.valueOf(100))  ;
           // double p = (double) (100-scanner.nextInt()) / 100;
            int p = scanner.nextInt();
            if (n ==0) break;
            int[] players = new int[n];
            for (int i =0; i<n; i++){
                players[i] = scanner.nextInt();
            }
            if (players[m-1] == 0){
                System.out.println(0);
            }else {
              //  int winMoney  = new BigDecimal(Arrays.stream(players).sum()* 100  * p / players[m-1]).intValue();
//               int winMoney1  = (p.multiply(BigDecimal.valueOf(Arrays.stream(players).sum() * 100)).divide(BigDecimal.valueOf(players[m-1]))).setScale(5,).intValue() ;
//               // System.out.println(winMoney);
//                double winMoney = Arrays.stream(players).sum() * 100 * p / players[m-1];
//                if (Math.round(winMoney) - winMoney < 0.00001){
//                    winMoney = Math.round(winMoney);
//                }
                int sum = Arrays.stream(players).sum();
                sum *= 100;
                sum *= (100-p);
                sum /= 100;
                sum /= players[m-1];
               System.out.println(sum) ;
            }
        }
    }
}

