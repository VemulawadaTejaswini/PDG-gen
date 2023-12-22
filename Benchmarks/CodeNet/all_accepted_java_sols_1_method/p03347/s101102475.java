import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        // スペース区切りの整数の入力
        int[] A=new int[N];
        long result=0;
        A[0]=sc.nextInt();
        if(A[0]>0){
            System.out.println(-1);
            return;
        }
        for(int i=1;i<N;i++){
            A[i]=sc.nextInt();
            if(A[i]>A[i-1]+1){
                System.out.println(-1);
                return;
            }
            if(A[i]<=A[i-1]){
                result+=(long)A[i-1];
            }
        }
        result+=(long)A[N-1];
        System.out.println(result);


    }
}