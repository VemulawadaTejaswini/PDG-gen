import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();

        int keep;

        if(a>b){
            keep=a;
            a=b;
            b=keep;
        }
        if(b>c){
            keep=b;
            b=c;
            c=keep;
        }
        if(a>b) {
            keep=a;
            a=b;
            b=keep;
        }
        System.out.println(a+" "+b+" "+c);
    }
}

