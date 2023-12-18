import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = 0;
        
        if(a>b){
            d = a;
            a = b;
            b = d;
        }
        if(b>c){
            d = b;
            b = c;
            c = d;
        }
        if(a>b){
            d = b;
            b = a;
            a = d;
        }
        
        System.out.println(a + " " + b + " " + c);
        
    }
}

