import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        int[] mx = new int[N+1];
        for(int i=N-1;i>=0;i--) mx[i]=Math.max(A[i],mx[i+1]);
        int[] dif = new int[N];
        int maxDif = 0;
        for(int i=0;i<N-1;i++){
            dif[i]=mx[i+1]-A[i];
            maxDif = Math.max(maxDif,dif[i]);
        }
        int cnt = 0;
        for(int i=0;i<N-1;i++) {
            if(dif[i]==maxDif) cnt++;
        }
        System.out.println(cnt);
    }
}
