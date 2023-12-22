import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
        
        int a=stdIn.nextInt();
        int b=stdIn.nextInt();
        int c=stdIn.nextInt();

        int t=a;
        a=b;
        b=t;
        t=a;
        a=c;
        c=t;

        System.out.println(a);
        System.out.println(b);
        System.out.print(c);
        
        
        
    }

}