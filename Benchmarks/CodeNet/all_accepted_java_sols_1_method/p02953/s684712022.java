import java.util.*;

public class Main{
    public static void main(String[] args){
    //入力
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] H = new int[N];
        int[] L = new int[N-1];
        for(int i=0; i<N; i++){
            H[i] = sc.nextInt();
        }
        for(int j=N-2;j>=0;j--){
            if(j<N-2){
                L[j] = Math.min(L[j+1],H[j+1]);
            }
            else{
                L[j] = H[j+1];
            }
        }
    //処理
        boolean b = true;
        for(int i=0;i<N-1;i++){
            if(H[i]-1>L[i]){
                b = false;
            }
        }
        System.out.println((b)?"Yes":"No");
        sc.close();

    }
}