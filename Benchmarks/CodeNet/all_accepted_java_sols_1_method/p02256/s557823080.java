import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x, y, a, b = 1;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        if(x > y){
            a = x;
            x = y;
            y = a;
        }
        while(b != 0){
            b = y % x;
            a = (y - b) / x;
            y = x;
            x = b;
        }
        System.out.println(y);
        sc.close();
    }
}

