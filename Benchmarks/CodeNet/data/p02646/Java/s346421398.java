import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        final long A,V,B,W,T ;
        A = sc.nextInt();
        V = sc.nextInt();
        B = sc.nextInt();
        W = sc.nextInt();
        T = sc.nextInt();
        sc.close();
        long diff = Math.abs(A - B);  
        if (Math.abs(V - W) * T >= diff && V - W >0){System.out.println("YES");}
        else {System.out.println("NO");}
    }
}