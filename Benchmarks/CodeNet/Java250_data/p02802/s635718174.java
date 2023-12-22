import java.util.*;
public class Main {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [] list = new int [N+1];
        int [] list2 = new int [N+1];
        for(int i=0;i<N+1;i++){
            list[i]=0;
            list2[i]=0;
        }
        for(int i=0;i<M;i++){
            int p = sc.nextInt();
            String S = sc.next();
            if(S.charAt(0)=='A'&&list[p]==0)list[p]=1;
            else if(S.charAt(0)=='W'&&list[p]==0) list2[p]++;
        }
        int A_sum =0, W_sum=0;
        for(int i=1;i<N+1;i++){
            if(list[i]==1){
                W_sum+=list2[i];
                A_sum++;
            }
        }
        System.out.println(A_sum+" "+W_sum);
    }
}
