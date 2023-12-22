import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, a, b;
        String N="", M="";
        a = scan.nextInt();
        b=scan.nextInt();
        for(i=0; i<b; i++){
            N = N+a;
        }
        for(i=0; i<a; i++){
            M = M+b;
        }
        if(N.compareTo(M)<=0) {
            System.out.println(N);
        }else{
            System.out.println(M);
        }
    }
}
