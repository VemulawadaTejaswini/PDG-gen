import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        double r;
        r=scan.nextDouble();
        System.out.printf("%f %f\n",r*r*Math.PI,2*r*Math.PI);
   }
}
