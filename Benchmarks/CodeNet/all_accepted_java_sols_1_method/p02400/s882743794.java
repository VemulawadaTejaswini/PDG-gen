import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        double r;
        double area,cir;
        r=scan.nextDouble();
        area = Math.PI * r * r;
        cir= Math.PI * 2 * r;
        System.out.printf("%.5f %.5f\n",area,cir);
    }
}
