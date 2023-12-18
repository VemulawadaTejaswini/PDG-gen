import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int N=sc.nextInt(),a[]=new int[3*N];
        for(int i=0;i<3*N;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        long res=0;
        for(int i=1;i<=N;i++){
            res+=a[3*N-2*i];
        }
        System.out.println(res);
    }
}
