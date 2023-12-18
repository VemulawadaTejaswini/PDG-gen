import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        long N = sc.nextLong();
        long[] n = new long[5];
        n[0] = sc.nextLong();
        long min = n[0];
        for(int i=1; i<5; i++){
            n[i] = sc.nextLong();
            min = Math.min(min, n[i]);
        }
        if(N%min==0){
            System.out.println(N / min + 4);
        }
        else{
            System.out.println(N / min + 5);
        }
    }
}