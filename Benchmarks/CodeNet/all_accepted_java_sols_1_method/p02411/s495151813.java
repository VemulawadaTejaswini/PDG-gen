import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
        int m=sc.nextInt();
        int f=sc.nextInt();
        int r=sc.nextInt();
        int p=(m+f);
        if(m==-1&f==-1&r==-1) {
            break;
        }
        if(30>p) {
            System.out.println("F");
        }
        else if(m==-1) {
            System.out.println("F");
        }
        else if(f==-1) {
            System.out.println("F");
        }
        else if(50>p&p>=30&r>=50) {
                System.out.println("C");
        }
        else if(65>p&p>=50) {
            System.out.println("C");
        }
        else if(50>p&p>=30) {
            System.out.println("D");
        }
        else if(80>p&p>=65) {
            System.out.println("B");
        }
        else if(p>=80){
            System.out.println("A");
        }
        else {
        }
 
        }
    }
}
