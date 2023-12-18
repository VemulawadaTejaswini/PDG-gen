import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.printf("%f %f",r*r*Math.PI,r*2*Math.PI);
    }
}
