import java.util.*;

class Main {

    public Main(){
        Scanner SC = new Scanner(System.in);
        long N = SC.nextLong();
        long K = SC.nextLong();

        int  A = 0;
        long R = 1;
        while(true){
            if(N < R) break;
            R = 1;
            for(int i=0;i<A;i++)
                R *= K;
            A++;
        }

        System.out.println(A-1);
    }

    public static void main(String[] args){
        Main main = new Main();
    }
}
