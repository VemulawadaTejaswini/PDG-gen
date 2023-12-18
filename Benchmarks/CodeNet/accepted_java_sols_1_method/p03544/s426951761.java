import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    long l0=2;
    long l1=1;
    long l=0;
    long n = sc.nextLong();
        for (int i = 0; i < n+1; i++) {
            if (i<2) {
                if (i==0) {
                    l=l0;
                }else{
                    l=l1;
                }
            }else{
                l=l0+l1;
                l0=l1;
                l1=l;
            }
        }
        System.out.println(l);
    }
}