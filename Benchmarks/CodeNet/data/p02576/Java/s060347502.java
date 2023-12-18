import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int x=s.nextInt();
        int t=s.nextInt();
        int ans=(int)Math.ceil((double)n/x);
        ans*=t;
        System.out.print(ans);

    }
}