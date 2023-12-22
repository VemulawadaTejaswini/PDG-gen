import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next());
        
        int[] a = new int[M];
        for(int i=0; i<M; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        int ans_1 = 0;
        for(int i=X+1; i<=N; i++){
            for(int j=0; j<M; j++){
                if(a[j] == i){
                    ans_1++;
                    break;
                }
            }
        }
        
        int ans_2 = 0;
        for(int i=X-1; i>=0; i--){
            for(int j=0; j<M; j++){
                if(a[j] == i){
                    ans_2++;
                    break;
                }
            }
        }
        
        System.out.println(Math.min(ans_1, ans_2));
    }
}