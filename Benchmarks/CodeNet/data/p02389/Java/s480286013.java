import java.util.Scanner;
public class Main{
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    int a = scan.next();
    int b = scan.next();

    if(a< b){
    System.out.println("a < b");
    } else if (a > b){
    System.out.println("a > b");
    } else if (a == b){
    System.out.println("a == b");
    }
}
}