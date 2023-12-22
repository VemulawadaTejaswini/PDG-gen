import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double r = sc.nextDouble();
        double x = (2*r)*Math.PI;
        double y = r*r*Math.PI;
        
        System.out.printf("%.6f %.6f\n",y,x);
        sc.close();
    }
}
