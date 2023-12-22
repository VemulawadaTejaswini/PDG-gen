import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int a=sc.nextInt();
            String op=sc.next();
            int b=sc.nextInt();
            if(op.equals("?"))break;
            System.out.println(Calc(a,op,b));
        }
    }

    public static int Calc(int a,String op,int b){
        if(op.equals("+"))return a+b;
        if(op.equals("-"))return a-b;
        if(op.equals("*"))return a*b;
        if(op.equals("/"))return a/b;
        else return -1;
    }
}
