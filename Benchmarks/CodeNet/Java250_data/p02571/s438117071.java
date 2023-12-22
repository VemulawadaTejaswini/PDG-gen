import java.util.*;


public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();
        char[] T = sc.next().toCharArray();
        int ans = 1001;
        for(int i=0;i<S.length-T.length+1;i++){
            int tempAns=0;
            for(int j=0;j<T.length;j++){
                if(S[i+j] != T[j]){
                    tempAns++;
                }
            }
            ans = Math.min(ans,tempAns);
        }
        System.out.println(ans);

    }

}


