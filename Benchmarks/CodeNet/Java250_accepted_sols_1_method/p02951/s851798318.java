import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int A = Integer.parseInt(scan.next()); 
        int B = Integer.parseInt(scan.next());
        int C = Integer.parseInt(scan.next());
        scan.close();
        
        int res = C - (A - B);
        res = res < 0 ? 0 : res;
        System.out.println(res);
    }
}