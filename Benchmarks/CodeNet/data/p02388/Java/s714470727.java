import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int val = scan.nextInt();
 
         val =  (int)Math.pow(val, 3.0);
 
         System.out.println(val);
    }
}
