import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        long N, A, B;
        Scanner sc = new Scanner(System.in);
        N = sc.nextLong();
        A = sc.nextLong();
        B = sc.nextLong();
      long n1 = N/(A+B);
        long n2 = N%(A+B);
        
        System.out.println(A*n1+(n2>=A?A:n2));
    }
}