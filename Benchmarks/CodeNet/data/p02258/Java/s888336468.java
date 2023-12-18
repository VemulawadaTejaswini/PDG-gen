import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double Rj = 0;
        double Ri = 0;
        double newR;
        double maxProfit = -1000000000;
        double tmpProfit = -1000000000;
        double tmp = 0;
        int value;
        
        newR = Integer.parseInt(scan.nextLine());
        Rj = newR;
        Ri = newR;

        for (int i=0; i<n; i++){
            if (newR < Ri){
                tmp = newR - Ri;
                if (tmp > tmpProfit)
                    tmpProfit = tmp;
                Ri = newR;
                Rj = newR;
                continue;
            }
            if (newR >= Rj){
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