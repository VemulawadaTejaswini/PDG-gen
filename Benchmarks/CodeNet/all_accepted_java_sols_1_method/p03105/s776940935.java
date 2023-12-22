import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        int a = t.nextInt();
        int b = t.nextInt();
        int c = t.nextInt();
        
        int d = b/a;
        
        if (d > c){
            System.out.println(c);
        } else {
            System.out.println(d);
        }
    }   
}