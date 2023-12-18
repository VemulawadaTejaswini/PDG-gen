import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String op = scanner.next();
        int b = scanner.nextInt();
         while(true){
        if ( op =="+"){
            System.out.println(a+b);
            if( op =="-"){
                System.out.println(a-b);
                if( op=="*"){
                    System.out.println(a*b);
                    if(op=="/"){
                        System.out.print(a/b);
                        if(op=="?"){
                            break;
                        }
                    }
                }
            }
        }
    }
    }}