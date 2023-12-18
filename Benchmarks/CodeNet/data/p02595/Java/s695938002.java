import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int [] X = new int[N];
        int [] Y = new int[N];
        
        for(int i=0; i<N; i++){
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }
        
        int count =0;
        
        for(int i=0; i<N; i++){
            if(Math.pow(X[i],2)+Math.pow(Y[i],2)<=Math.pow(D,2)){
                count++;
            }
        }
        
        System.out.println(count);
    }
}
