import java.util.Scanner;
class Main{
    public static void main(String[] args){
        
        double x = Math.PI;
        
        Scanner sc = new Scanner(System.in);
        
        double r = sc.nextDouble();
        System.out.println(String.format("%.6f",r*r*x) + " "+ String.format("%.6f",2*r*x));
    }
}

