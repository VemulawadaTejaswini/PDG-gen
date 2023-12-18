import java.util.*;

class Main{

    public static void main(String args[]) throws Exception{
        Main main = new Main();
    }

    public Main(){
        Scanner scanner = new Scanner(System.in);
        long A,B,K;
        A = scanner.nextLong();
        B = scanner.nextLong();
        K = scanner.nextLong();

        if(K>=A+B){
            A = 0L;
            B = 0L;
        } else if(K>=A){
            K -= A;
            A =0L;
            B -= K;
        } else {
            A -= K;
        }

        System.out.print(A + " " + B);
    }
}
