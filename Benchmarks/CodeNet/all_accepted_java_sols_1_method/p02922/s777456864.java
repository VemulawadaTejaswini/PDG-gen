import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(b == 1){
            System.out.println(0);
            return;
        }
        if(a == b){
            System.out.println(1);
            return;
        }
        int c = a;
        int out = 1;
        while(c < b){
            c += a - 1;
            out++;
        }
        System.out.println(out);
        scan.close();
    }
}
