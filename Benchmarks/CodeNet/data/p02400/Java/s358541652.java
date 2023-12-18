import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double r = sc.nextDouble();
        double cirm = (2*r)*Math.PI;
        double cirs = r*r*Math.PI;
        
        System.out.printf("%.6f %.6f\n",cirm,cirs);
        sc.close();
    }
}
