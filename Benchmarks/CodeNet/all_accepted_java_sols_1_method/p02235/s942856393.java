import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            String s = sc.next();
            String t = sc.next();
            int DP[][] = new int[s.length()+1][t.length()+1];
            for(int j=0;j<s.length()+1;j++)Arrays.fill(DP[j],0);
            for(int j=1;j<=s.length();j++){
                for(int k=1;k<=t.length();k++){
                    if(s.charAt(j-1)==t.charAt(k-1)) DP[j][k] = Math.max(DP[j][k],DP[j-1][k-1]+1);
                    else DP[j][k] = Math.max(DP[j-1][k],DP[j][k-1]);
                }
            }
            System.out.println(DP[s.length()][t.length()]);
        }
    }
}
