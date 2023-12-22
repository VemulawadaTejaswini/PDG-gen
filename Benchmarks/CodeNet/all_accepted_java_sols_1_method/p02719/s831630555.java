import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long N =  sc.nextLong();
        long M =  sc.nextLong();

        if(N>=M)
        N = N%M;
        while(true){
            long temp =  Math.abs(N-M);
            if(temp>=N){
                break;
            }
            N=temp;
        }
        System.out.println( N);
    }

}
