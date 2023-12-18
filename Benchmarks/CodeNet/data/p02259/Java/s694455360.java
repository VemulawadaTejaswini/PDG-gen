import java.util.*;


public class Main{

    public static int bubble(int A[],int N) {
        int flag=1,cnt=0;
        while(flag==1){
            flag=0;
            for(int j=N-1;j>0;j--){
                if(A[j]<A[j-1]){
                    int t=A[j];
                    A[j]=A[j-1];
                    A[j-1]=t;
                    cnt++;
                    flag=1;
                }
            }
        }
        return cnt;

    }

    public static void main( String[] args) {

        Scanner sc = new Scanner(System.in);

        int count=0;
        int N = sc.nextInt();
        int[] A;
        A = new int[100];

        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        count = bubble(A,N);

        for(int i=0;i<N;i++){
            System.out.print(A[i]);
            if(i!=N-1)  System.out.print(" ");
        }
        System.out.println("\n"+count);

        sc.close();
    }
}
