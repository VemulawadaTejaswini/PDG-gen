import java.util.Scanner;
class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a, b, result=0;
    char op;
    while(true){
            a = sc.nextInt();
            op = sc.next().charAt(0);
            b = sc.nextInt();
         
        if(op == '?') break;
        if(op == '+') result = a + b;
        if(op == '-') result = a - b;
        if(op == '*') result = a * b;
        if(op == '/') result = a / b;
 
        System.out.println(result);
    }
    }
}