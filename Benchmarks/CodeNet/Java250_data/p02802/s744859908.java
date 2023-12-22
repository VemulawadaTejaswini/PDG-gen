import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] p = new int[M];
        String[] S = new String[M];
        String A = "AC";
        String W = "WA";
        int ac = 0;
        int wa = 0;
        String[] sn = new String[N + 1];
        int[] wn = new int[N + 1];
        int[] an = new int[N + 1];
 
        for(int i=0; i<M; i++){
            p[i] = sc.nextInt();
            S[i] = sc.next();
            if(an[p[i]]==1){
                continue;
            }
            else{
                if(S[i].equals(A)){
                    an[p[i]] = 1;
                }
                else if(S[i].equals(W)){
                    wn[p[i]] += 1;
                }
            }
        }
 
        for(int i=1; i<=N; i++){
            if(an[i]==1){
                ac += 1;
                wa += wn[i];
            }
        }
 
        System.out.println(ac + " " + wa);
    }
}