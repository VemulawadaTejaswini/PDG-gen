import java.util.Scanner;
public class Main {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
         int D = sc.nextInt();
         int[] X = new int[N];
         int[] Y = new int[N];
         int ans = 0;
    
         for(int i = 0 ; i < N ; i++){
                X[i] = sc.nextInt();
                Y[i] = sc.nextInt();
                if(Math.sqrt(Math.pow(X[i],2)+Math.pow(Y[i],2)) <= D){
                    ans++;
                }
         }
         System.out.println(ans);
    }     
}
