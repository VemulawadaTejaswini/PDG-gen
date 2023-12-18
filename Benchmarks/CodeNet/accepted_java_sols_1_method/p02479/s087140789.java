import java.util.Scanner;
 
class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
 
        double r = scan.nextDouble();
 
        System.out.printf("%f %f", Math.PI * Math.pow(r, 2), 2 * Math.PI * r);
    }
}