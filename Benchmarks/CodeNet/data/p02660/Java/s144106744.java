import java.util.Scanner;
import java.lang.Math;
import java.math.BigDecimal;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int zCount =0;
        int devisor =2;

        //ごり押しで素因数分解
        while(n>1){
            int devideCount =0;
            while(true){
                if(n % devisor ==0){
                    n = n/devisor;
                    devideCount++;
                }
                else{
                    break;
                }
            }
            for(int j=1; j<=devideCount; j++){
                if(devideCount<j){
                    break;
                }
                devideCount = devideCount - j;
                zCount++;
            }
            devisor++;
        }
        System.out.println(zCount);
    }
}