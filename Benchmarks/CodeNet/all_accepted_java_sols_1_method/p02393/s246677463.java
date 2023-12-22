import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.next());
        int b = Integer.parseInt(scan.next());
        int c = Integer.parseInt(scan.next());
        if(a <= b && b <= c){
            System.out.println(a+" "+b+" "+c);
            return;
        }
        if(a <= c && c <= b){
            System.out.println(a+" "+c+" "+b);
            return;
        }
        if(b <= a && a <= c){
            System.out.println(b+" "+a+" "+c);
            return;
        }
        if(b <= c && c <= a){
            System.out.println(b+" "+c+" "+a);
            return;
        }
        if(c <= a && a <= b){
            System.out.println(a+" "+a+" "+b);
            return;
        }
        if(c <= b && b <= a)
            System.out.println(c+" "+b+" "+a);{
            return;
        }
    }
}