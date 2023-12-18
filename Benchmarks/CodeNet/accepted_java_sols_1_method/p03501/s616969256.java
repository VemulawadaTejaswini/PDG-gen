import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int fee = n*a;
        if(fee>b)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(fee);
        }
    }
}
