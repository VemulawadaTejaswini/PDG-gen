import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        System.out.printf("%f %f", r*r*Math.PI, 2*r*Math.PI);
    }
}