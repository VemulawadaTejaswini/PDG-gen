import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b;
        int c;
        if(a == 1){
            System.out.println("Hello World");
        }
        if(a == 2){
            b = sc.nextInt();
            c = sc.nextInt();
            System.out.println(b + c);
        }
    }
}