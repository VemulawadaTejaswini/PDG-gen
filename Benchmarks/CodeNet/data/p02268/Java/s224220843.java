import java.util.*;

public class Main {
    static int calu(int n, int m, int A[], int S[]) {
        int count=0;
        for(int i=0;i<m;i++){
            count+=bsearch(S[i],A,0,n);
        }
        return count;
    }
    static int bsearch(int si,int A[],int left,int right)
    {   
        while (left < right){
            int mid = (left + right) / 2;
            if (A[mid] == si) return 1;
            else if (si < A[mid]) right = mid;
            else left = mid + 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A,S;
        A = new int[n]; 
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        S = new int[m];
        for(int i = 0; i < m; i++) {
            S[i] = sc.nextInt();
        }
        System.out.println(calu(n,m,A,S));
        sc.close();
    }
}
