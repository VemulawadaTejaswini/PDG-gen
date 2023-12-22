import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = x > y ? x : y;
        int b = x > y ? y : x;
        while(b != 0){
            int c = a % b;
            a = b;
            b = c;
        }
        System.out.println(a);
    }
}