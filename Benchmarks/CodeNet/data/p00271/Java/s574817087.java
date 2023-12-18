
import java.util.Scanner;

class Main {
        
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    
        int i; 
        int a;
        int b;
        
        for(i=0; i<7; i++){
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println(a-b);
        }
    }
}


