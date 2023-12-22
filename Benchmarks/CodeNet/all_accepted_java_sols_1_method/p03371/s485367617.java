import java.util.Scanner;
import java.math.*;

class Main {
    public static void main(String[] args){
    	 Scanner sc = new Scanner(System.in);
         int aPrice = sc.nextInt();
         int bPrice = sc.nextInt();
         int abPrice = sc.nextInt();
         int aNeed = sc.nextInt();
         int bNeed = sc.nextInt();
         int most,res;
         if(aNeed>bNeed){
            most = aPrice;
         }else{
            most = bPrice;
         }
         if(aPrice+bPrice<=2*abPrice){
            res = (aPrice*aNeed)+(bPrice*bNeed);
         }else{
            res = (abPrice*Math.min(aNeed,bNeed)*2)+(Math.min(most,2*abPrice)*Math.abs(aNeed-bNeed));
         }
         System.out.println(res);
    }    
}