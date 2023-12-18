import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0;
        while (n-->0){
            int m1=sc.nextInt();
            int m2=sc.nextInt();
            if ( m1==m2 ) {
                cnt++;
            }else {
                cnt=0;
            }
        }
        if ( cnt>=3 ) System.out.println("Yes");
        else System.out.println("No");
    }
}