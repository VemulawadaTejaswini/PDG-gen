import java.util.*;
public class Main {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        int [] X = new int[N];
        int [] Y = new int[N];
        double sum = 0;
        int time = 1;
        int n =1;
        for(int i=N-1;i>0;i--) time*=i;
        for(int i=N;i>0;i--) n*=i;
        time*=2;
        for(int i=0;i<N;i++){
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                double x = Math.pow(X[i]-X[j],2);
                double y = Math.pow(Y[i]-Y[j],2);
                double dis = Math.sqrt(x+y)*time;
                sum+=dis;
            }
        }
        sum/=n;
        System.out.println(sum);
    }
}