import java.util.Scanner;

public class Main {
    public static void main(String[] ars) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(++i <= 10000){
            int x = sc.nextInt();
            if(x == 0) break;
            else if(x > 0) System.out.println("Case " + i + ": " + x);
        }
    }
}

