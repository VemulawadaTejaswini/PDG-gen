import java.util.Scanner;

public class Main {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int [] x = new int[N];
        for (int i=0;i<N;i++){
            x[i] =sc.nextInt();
        }
        int min =0;
        for (int i=0;i<N;i++){
            if(Math.abs(K-x[i])*2>= x[i]*2){
                min +=x[i]*2;
            }else{
                min +=Math.abs(K-x[i])*2;
            }
        }
        System.out.println(min);
    }
}