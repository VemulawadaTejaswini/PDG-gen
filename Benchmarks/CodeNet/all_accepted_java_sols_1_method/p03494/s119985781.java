import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(),A[]=new int[N],Ma=0;
        for(int i=0;i<N;i++){
            int t=sc.nextInt(),n=0;
          	if(t%2==1){
              	Ma=0;
              	break;
            }
            while(t%2==0){
                n++;
                 t/=2;
            }
            if(Ma==0&&n!=0){
                Ma=n;
            }
            else{
                Ma=Math.min(n,Ma);
            }
        }
        System.out.println(Ma);
    }
}