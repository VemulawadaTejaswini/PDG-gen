import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int F = S / 100;
        int B = S % 100;
        System.out.println((F>=1&F<=12) ? (B>=1&B<=12) ? "AMBIGUOUS":"MMYY":(B>=1&B<=12) ? "YYMM":"NA");
        sc.close();
    }
}