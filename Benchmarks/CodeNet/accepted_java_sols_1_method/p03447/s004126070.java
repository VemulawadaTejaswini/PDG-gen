import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int X=s.nextInt();
        int A=s.nextInt();
        int B=s.nextInt();
        int ans=X-A;
        int N=ans/B;
        for(int i=0;i<N;i++){
            ans=ans-B;
        }
        System.out.print(ans);
    }
    
}