import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r=sc.nextDouble();
        System.out.println(String.format("%.6f",r*r*Math.PI) + " " + String.format("%.6f",r*2*Math.PI));
    }
}
