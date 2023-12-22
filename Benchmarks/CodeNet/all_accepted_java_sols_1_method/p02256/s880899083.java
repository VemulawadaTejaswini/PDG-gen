import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = Integer.valueOf(scan.next());
        int b = Integer.valueOf(scan.next());
        int r = 0;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        System.out.println(a);
        scan.close();
    }
}
