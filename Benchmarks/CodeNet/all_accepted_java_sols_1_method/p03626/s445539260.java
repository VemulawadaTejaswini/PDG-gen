import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S1 = sc.next();
        String S2 = sc.next();
        final int Mod = 1000000007; // about 1e9
        int left=0;
        long cur = 3;
        if(S1.charAt(0)!=S2.charAt(0)){
            left=1;
            cur = 6;
        }
        int right = left+1;
        while(right<N){
            if(S1.charAt(right)!=S2.charAt(right)) right++;
            if(right==left+1){
                if(S1.charAt(left)!=S2.charAt(left)) cur = cur;
                else{
                    cur = (2*cur)%Mod;
                }
            }
            else{
                if(S1.charAt(left)!=S2.charAt(left)) cur = (3*cur)%Mod;
                else cur = (2*cur)%Mod;
            }
            left = right;
            right++;
        }
        System.out.println(cur);
    }
}
