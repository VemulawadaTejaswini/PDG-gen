import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        double[] v = new double[N];
        for(int i = 0; i < N; i++){
            v[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(v);
        for(int i = 0 ; i < N-1; i++){
            v[1] = (v[0] + v[1]) / 2;
            v[0] = 1001;
            Arrays.sort(v);
        }
        System.out.println(v[0]);
    }
}