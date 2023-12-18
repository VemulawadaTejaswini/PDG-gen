import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        if(a == 0){
            System.out.println(1);
        }else if(b == 0){
            System.out.println(2);
        }else if(c == 0){
            System.out.println(3);
        }else if(d == 0){
            System.out.println(4);
        }else if(e == 0){
            System.out.println(5);
        }


    }
}