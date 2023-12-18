
import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c;
            int d;
            int e;
            int g;
            e = a;
            g = b;
            while (a % b != 0) {
                c = a;
                a = b;
                b = c % b;
            }
            System.out.print(b);
            d = e/b * g;
            System.out.print(" ");
            System.out.println(d);
        }
    }
}
        
           
            

            

            
       
    

        
      
    


