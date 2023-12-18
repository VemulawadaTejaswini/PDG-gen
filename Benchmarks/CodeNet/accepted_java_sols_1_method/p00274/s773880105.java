import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int n = sc.nextInt();
            if(n==0) {
                break;
            }
            boolean f=false;
            int c=0;
            for(int i=0;i<n;i++) {
                int m=sc.nextInt();
                if(m>=2) {
                    f=true;
                }
                if(m==0) {
                    c++;
                }
            }
            System.out.println(f&&n>0?n+1-c:"NA");
        }
    }
}

