import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static int a,b,c;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            if(a==-1&&b==-1&&c==-1) break;
            if(a==-1||b==-1) System.out.println("F");
            else if(a+b>=80) System.out.println("A");
            else if(a+b>=65) System.out.println("B");
            else if(a+b>=50) System.out.println("C");
            else if(a+b>=30&&c>=50) System.out.println("C");
            else if(a+b>=30) System.out.println("D");
            else System.out.println("F");
        }
        sc.close();
    }
}
