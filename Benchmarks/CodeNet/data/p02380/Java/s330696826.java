import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int C = sc.nextInt();
        
        double RC = C / 180.0 *Math.PI; 
        
        System.out.println(1.0 / 2 * a * b * Math.sin(RC));
        
        System.out.println(a + b + Math.sqrt((a * a) + (b * b) - (2 * a * b * Math.cos(RC))));
        
        System.out.println(b * Math.sin(RC));
    }
}
