import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int N=sc.nextInt();
        int D=sc.nextInt();
        int X=sc.nextInt();
        int[] A=new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        
        int ans=X;
        for(int i=0;i<N;i++){
            ans+=(D-1)/A[i]+1;
        }
        
        System.out.println(ans);
    }
}