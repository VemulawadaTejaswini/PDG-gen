import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n1, n2, n3;
        if(a <= b && a <= c){
            if(b <= c)
                System.out.println(a + " " + b + " " + c);
            else
                System.out.println(a + " " + c + " " + b);
        }
        else if(b <= a && b <= c){
            if(a <= c)
                System.out.println(b + " " + a + " " + c);
            else
                System.out.println(b + " " + c + " " + a);
        }
        else{
            if(b <= a)
                System.out.println(c + " " + b + " " + a);
            else
                System.out.println(c + " " + a + " " + b);
        }
    }
}

