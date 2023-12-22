import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while(true){
        int a=sc.nextInt();
        String x=sc.next();
        int b=sc.nextInt();
        if(x.equals("+"))System.out.println(a+b);
        if(x.equals("-"))System.out.println(a-b);
        if(x.equals("*"))System.out.println(a*b);
        if(x.equals("/"))System.out.println(a/b);
        if(x.equals("?"))break;
        }
        sc.close();
    }
}

