import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        if(r<=0 || 10000<=r){
            System.exit(-1);
        }
        System.out.println(String.format("%f",r*r*Math.PI) + " " + 2*r*Math.PI);
    }
}