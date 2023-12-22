import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] L = new int[M];
        int[] R = new int[M];
        for(int i = 0; i < M; i++){
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
        }
        sc.close();
        if(min(R) - max(L) < 0)
            System.out.println(0);
        else   
            System.out.println(min(R) - max(L) + 1);
    }

    static int min(int[] l){
        int min = l[0];
        for(int i = 0; i < l.length; i++){
            if(l[i] < min)
                min = l[i];
        }
        return min;
    }
    static int max(int[] r){
        int max = r[0];
        for(int i = 0; i < r.length; i++){
            if(r[i] > max)
                max = r[i];
        }
        return max;
    }
}
