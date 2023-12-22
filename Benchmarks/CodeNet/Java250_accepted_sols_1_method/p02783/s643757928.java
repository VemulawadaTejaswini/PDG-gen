import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = Integer.parseInt(scan.next());
        int a = Integer.parseInt(scan.next());
        //int c = Integer.parseInt(scan.next());
        int cnt = 0;
        while(h>0) {
            h = h-a;
            cnt++;
        }
        System.out.println(cnt);
    }
}
