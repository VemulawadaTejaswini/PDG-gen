import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double Rj = 0;
        double Ri = 0;
        double newR;
        double maxProfit = -10000;
        double tmpProfit = 0;
        double tmp = 0;

        int value;
        for (int i=0; i<n; i++){
            newR = Integer.parseInt(scan.nextLine());
            if (i == 0){
                Rj = newR;
                Ri = newR;
                continue;
            }
            if (newR < Ri){
                tmpProfit = newR - Ri;
                Ri = newR;
                Rj = newR;
                continue;
            }
            if (newR > Rj){
                Rj = newR;
                tmp = Rj - Ri;
                if (tmp > maxProfit)
                    maxProfit = tmp;
                continue;
            }
        }

        if (tmpProfit > maxProfit)
            maxProfit = tmpProfit;

        System.out.println((int)(maxProfit));
    }
}