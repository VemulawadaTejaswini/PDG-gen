import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int[] xi = new int[N];
        for(int i = 0; i < N; i++){
            xi[i] = sc.nextInt();
        }
        
        int hydrationCount = 0;
        while(notAllZero(xi)){
            hydrate(xi);
            hydrationCount++;
        }
        
        System.out.println(hydrationCount);
    }
    public static boolean notAllZero(int[] xi){
        for(int i = 0; i < xi.length; i++){
            if(xi[i] != 0) return true;
        }
        return false;
    }
    public static void hydrate(int[] xi){
        final int N = xi.length;
        int l = 0;
        int r = xi.length - 1;
        l = findIndexOfL(xi, l, r);
        r = findIndexOfR(xi, l, r);
        for(int j = l; j <= r; j++){
            xi[j]--;
        }
    }
    public static int findIndexOfL(int[] xi, int l, int r){
        for(int k = l; k <= r; k++){
            if(k < r){
                if(xi[k] == 0 && xi[k+1] != 0) return k+1;
            }
        }
        return l;
    }
    public static int findIndexOfR(int[] xi, int l, int r){
        for(int k = l; k <= r; k++){
            if(0 < k){
                if(xi[k] == 0 && xi[k-1] != 0) return k-1;
            }
        }
        return r;
    }
}
