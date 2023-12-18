
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.sql.Array;
import java.util.*;

public class Main {

    static long gcd (long a, long b) {return b>0?gcd(b,a%b):a;}
    static long lcm (long a, long b) {return a*b/gcd(a,b);}

    public static void main(String[] args){
	// write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<Integer> set = new HashSet<Integer>();
        int[] A= new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        for (int i=0; i<(Math.pow(2,n)); i++) {
            int temp = 0;
            for (int j=0; j<n; j++) {
                if ((1&i>>j) == 1) {
                    temp += A[j];
                }
            }
            set.add(temp);

        }
        int q=sc.nextInt();
        int[] m=new int[q];
        boolean[] ans=new boolean[q];
        for(int i=0;i<q;i++){
            m[i] = sc.nextInt();
            if(set.contains(m[i])){
                ans[i] = true;
            }else{
                ans[i] = false;
            }
        }
        for(int i=0;i<q;i++){
            if(ans[i]){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}

