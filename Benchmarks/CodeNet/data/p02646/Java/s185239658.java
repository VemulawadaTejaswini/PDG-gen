import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        final int A,V,B,W,T ;
        A = sc.nextInt();
        V = sc.nextInt();
        B = sc.nextInt();
        W = sc.nextInt();
        T = sc.nextInt();
        sc.close();
        int diff = Math.abs(A - B);
        if(diff == 0){System.out.println("Yes");}
        else if (Math.abs(V - W) * T >= diff && V - W > 0 && B - A > 0){System.out.println("Yes");}
        else {System.out.println("No");}
    }
}