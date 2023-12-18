import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int iniNum, RiNum;
        iniNum = scan.nextInt();
        int buyPrice=1000000001, maxProfit=-1000000001;
        
        for(int i=0; i<iniNum; i++){
            RiNum = scan.nextInt();

            maxProfit= i==0? -1000000000: Math.max(maxProfit,RiNum-buyPrice);
            buyPrice=Math.min(buyPrice,RiNum);

        }
        System.out.println(maxProfit);            
    }
}
