import java.util.*;
import java.io.*;
import java.lang.Math.*;

class Main{

    static int n;
    static int k;

    //static int[] mData = new int[100000];
    static ArrayList<Integer> mData = new ArrayList<Integer>();

    //dp[t] = 1 kaze da u situaciji kad je prvi na potezu, ostalo t kamencica, prvi ima pobjednicku
    //dp[t] = 2 drugi ima pobjednicku
    static int[] dp = new int[100001];

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        n = sc.nextInt();
        k = sc.nextInt();

        //mData.add(0);
        for(int i = 0; i < n; i++){
            mData.add( sc.nextInt() );            
            //mData[i] = sc.nextInt();
        }

        //if( mData.get(0) == 1 ) dp[1] = 1;
        //else dp[1] = 2;

        for(int i = 1; i < k+1; i++){
            int ind = Collections.binarySearch(mData, i);
            if(ind >= 0) dp[i] = 1;
            else{
                ind = -ind -1;
                int res = 2;
                for(int j = 0; j < ind; j++){
                    if( dp[i - mData.get(j)] == 2){
                        res = 1;
                        break;
                    }
                }
                dp[i] = res;
            }
        }
    /*
        for(int i = 1; i < 10; i++){
            System.out.print(dp[i] + "\t" );
        }
    */
        if( dp[k] == 1 ) System.out.println("First");
        else System.out.println("Second");
        

        sc.close();
    }
}













