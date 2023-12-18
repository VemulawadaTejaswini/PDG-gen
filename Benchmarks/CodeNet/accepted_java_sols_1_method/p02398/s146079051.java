import java.util.Scanner;

public class Main{
    public static void main(String[] arg){
        int a, b, c, i, n;
        n = 0;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        for(i = a; i <= b; i++){
            if(c % i == 0) n++;
        }
        System.out.println(n);
        scan.close();
    }
}
