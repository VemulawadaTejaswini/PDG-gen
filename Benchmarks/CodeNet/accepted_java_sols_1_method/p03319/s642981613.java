import java.util.Arrays;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N  = scan.nextInt();
        int K  =scan.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;++i)A[i]=scan.nextInt();
        int index = 0;
        for(int i=0;i<N;++i)if(A[i]==1)index=i;
        int ans = index/(K-1);
        index = (K-1)*ans;
        while(index<N-1){
            index+=(K-1);
            ++ans;
        }
        System.out.println(ans);
    }
}