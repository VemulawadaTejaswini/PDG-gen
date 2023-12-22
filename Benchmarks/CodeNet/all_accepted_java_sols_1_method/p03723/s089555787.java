import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int count=0;
        int A2,B2,C2;
        while( A%2==0 && B%2==0 && C%2==0 ){
            if(A==B&&B==C&&A==C){
                System.out.println("-1");
                return;
            }
            A2=A/2;
            B2=B/2;
            C2=C/2;
            A=B2+C2;
            B=A2+C2;
            C=B2+A2;
            
            count++;
        }
        System.out.println(count);
    }
}
