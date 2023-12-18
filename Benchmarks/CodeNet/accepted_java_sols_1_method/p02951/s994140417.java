import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avl = a - b ; 
        if(c>avl)System.out.println(c-avl);
        else
        System.out.println(0);
    }
}
