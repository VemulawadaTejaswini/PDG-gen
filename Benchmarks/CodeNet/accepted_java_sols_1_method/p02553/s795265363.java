import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long A[] =new long[4];
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();
        
        
        
        A[0]=a*c;
        A[1]=a*d;
        A[2]=b*c;
        A[3]=b*d;
        
        Arrays.sort(A);
        
        System.out.println(A[3]);
        
    }
}
