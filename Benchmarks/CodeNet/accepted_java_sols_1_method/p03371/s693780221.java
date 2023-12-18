import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long[] price = new long[3];
        for(int i=0;i<3;i++) price[i]=sc.nextLong();
        long[] piece = new long[2];
        piece[0] = sc.nextLong();
        piece[1] = sc.nextLong();
        if(piece[0]>piece[1]){ // piece[0] is always the pizza less needed
            long med = piece[0];
            piece[0] = piece[1];
            piece[1] = med;
            long priceMed = price[0];
            price[0] =price[1];
            price[1] = priceMed;
        }
        long ans = 0;
        ans += Math.min(price[0]*piece[0]+price[1]*piece[0],price[2]*2*piece[0]);
        ans += Math.min(price[1]*(piece[1]-piece[0]),price[2]*2*(piece[1]-piece[0]));
        System.out.print(ans);
    }
}