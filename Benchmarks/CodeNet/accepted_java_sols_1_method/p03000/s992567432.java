import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next());
        int[] L = new int[N+1]; 
        int D = 0;
        int count = 1;
        int ans = N+1;
        for(int i = 1; i <= N; i++) {
            L[i] = Integer.parseInt(sc.next());
            D += L[i];
            count++;
            if(D > X) {
                ans = count-1;
                break;
            }
        }
        
        System.out.println(ans);
    }
}