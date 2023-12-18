import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int H = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());

        double x2 = A*A + B*B -2*A*B*(Math.cos(Math.toRadians(30*H+(double)(M/2.0)-6*M)));
        double ans = Math.sqrt(x2);
        
        System.out.println(ans);

        sc.close();
    }
    
}