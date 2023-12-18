import java.util.*;

class Main{
    public Main(){
        Scanner SC = new Scanner(System.in);
        long X = Long.parseLong(SC.next());

        ArrayList<Long> factor = new ArrayList<Long>();

        for(long i=1;i*i<=X;i++){
            if(X % i == 0){
                factor.add(i);
                factor.add(X/i);
            }
        }

        long A, B = 0;
        while(true){
            for(long f : factor){
                A = f + B;
                if(A*A*A*A*A-B*B*B*B*B == X){
                    System.out.println(A + " " + B);
                    return;
                }
                A = f - B;
                if(A*A*A*A*A+B*B*B*B*B == X){
                    System.out.println(A + " " + -1*B);
                    return;
                }
            }
            B++;
        }
    }

    public static void main(String args[]){
        Main main = new Main();
    }
}
