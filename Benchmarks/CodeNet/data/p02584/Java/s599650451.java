import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        long x = fs.nextLong();
        long k = fs.nextLong();
        long d = fs.nextLong();

        long moves = x/d ;
      	if(moves<0){
        moves = moves * -1 ;
        }
        moves = Math.min(k,moves);
        long rem = k - moves;

        long pos_g = -1 ;
        long neg_g = Long.MAX_VALUE ;

        pos_g = x - moves * d;
        if(rem%2==1){
            pos_g += d ;
        }
        if(rem>0){
            neg_g = x - (moves+1) * d ;
            rem--;
            if(rem%2==1){
                neg_g += d ;
            }
        }

        System.out.println(Math.abs(Math.min(pos_g,neg_g)));


    }
}
