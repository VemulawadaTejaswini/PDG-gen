import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int N=sc.nextInt(),a[]=new int[N];
        boolean F[]=new boolean[N];
        Arrays.fill(F,false);
        for(int i=0;i<N;i++){
            a[i]=(sc.nextInt()-1);
        }
        int t=0,c=0;
        while(true){
            if(F[t]||F[1]){
                break;
            }
            c++;
            F[t]=true;
            t=a[t];
        }
        System.out.println(F[1]?c-1:-1);
    }
}
