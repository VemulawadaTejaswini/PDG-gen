import java.util.Scanner;
public class Main{
public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d;
    d = a;
    a = b;
    b = d;
    d = c;
    c = a;
    a = d;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    
}
}
