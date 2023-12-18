import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.util.*;


public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder("");

    static int[] inputArray(int n) throws IOException {
        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        return a;
    }

    static long modExpo(long x , long y , int mod){
        long res = 1;
        for(long i = 0 ; i < y ; i++){
            res = res * x % mod;
        }
        return res;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        long n = Long.parseLong(br.readLine());
        int m = (int)1e9 + 7;
        long a1 = modExpo(10 , n , m);
        long a2 = modExpo(9 , n , m);
        long a3 = modExpo(8 , n , m);
        //System.out.println(a1 + " " + a2 + " " + a3);
        System.out.println((a1 - 2*a2 % m + a3 + m) % m);
    }

    static int gcd(int a , int b) {
        if(a % b == 0) {
            return b;
        }
        return gcd(b , a % b);
    }

    static void longestGcdSeq(int a[] , int n) {
        int coprimes[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            if(a[i] < a[(i+1)%n]) {
                if(gcd(a[(i+1)%n] , a[i]) != 1) {
                    coprimes[i] = 1;
                }
            }
            else {
                if(gcd(a[i] , a[(i+1)%n]) != 1) {
                    coprimes[i] = 1;
                }
            }
        }
        //System.out.println(Arrays.toString(coprimes));
        int maxLen = 0 , startLen = 0 , endLen = 0;
        int i = 0;
        while(i < n && coprimes[i] == 1) {
            startLen++;
            i++;
        }
        i = n -1;
        while(i >= 0 && coprimes[i] == 1) {
            endLen++;
            i--;
        }
        int start = 0;
        for(i = 0 ; i < n ; i++) {
            if(coprimes[i] == 0) {
                maxLen = Math.max(maxLen , i - start);
                start = i + 1;
            }
        }
        maxLen = Math.max(maxLen , i - start);
        start = i + 1;
        //System.out.println(startLen + " " + maxLen + " " + endLen);
        int contMax = startLen == n ? n : Math.max(startLen + endLen , maxLen) + 1;
        //System.out.println(contMax);
        for(int k = 2 ; k <= n ; k++) {
            System.out.print((contMax-1)/(k-1) + " ");
        }
        System.out.println();
    }

}
/*

if(tree.size == 2) {

}

5 8
5 1 2 4 3
0 1
0 2
0 3
0 4
0 5
1 1000000000
1 1
1 500000000


 */