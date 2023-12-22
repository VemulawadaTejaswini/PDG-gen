import java.util.*;
import java.lang.*;

public class Main{

    public static void solve(long s , long w){
        if(w >= s){
            System.out.println("unsafe");
        }else{
            System.out.println("safe");
        }
    }

    public static void gora(){
        Scanner scn = new Scanner(System.in);

        // long test = scn.nextLong();

        long s = scn.nextLong();

        long w = scn.nextLong();

        // long arr[] = new long[n];

        // for(int i = 0 ; i < arr.length ; i++){
        //     arr[i] = scn.nextLong();
        // }

        solve(s, w);
    }

    public static void main(String args[]){
        gora();
    }
}


