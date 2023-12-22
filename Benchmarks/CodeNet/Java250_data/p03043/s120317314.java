import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        double prob=0;
//        for (int i = 1; i <= Math.min(K,N); i++) {1
        for (int i = 1; i <= N; i++) {
            if(i < K ){
                int times = log((double)K/i,2 );
//                System.out.println(i+" "+ log(K/i,2 ) +" "+ Math.max(log((double) K/i,2 ),0) +" "+ times);
                prob+= (double) 1/N * Math.pow((double) 0.5 ,times ) ;
            }else{
  //              System.out.println(i+" "+ 0 );
                prob+= (double) 1/(double)N;
            }
        }
        System.out.println(prob);
    }


    static int log(double x, int base)
    {
        return (int) Math.ceil (Math.log(x) / Math.log(base));
    }

}