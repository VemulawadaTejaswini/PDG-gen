/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int max = -1;
        for (int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }

        Arrays.sort(arr);

        boolean[] dp = new boolean[max+1];
        int[] count = new int[max+1];
        //dups
        for (int i=0; i<N; i++){
            count[arr[i]]++;
        }
        //sieve
        for (int i=0; i<N; i++){
            if (!dp[arr[i]]){
                for (int j=2; j*arr[i]<=max; j++){
                    dp[j*arr[i]]=true;
                }
            }
        }

        int ans=0;
        for (int i=0; i<N; i++){
            if (!dp[arr[i]]&&count[arr[i]]==1)
                ans++;
        }

        System.out.println(ans);


    }




}

