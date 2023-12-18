import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double a=sc.nextDouble();
        Double b=sc.nextDouble();
        Double c=sc.nextDouble();
        sc.close();
        //三角形の面積
        System.out.println(a*b*Math.sin(c* (Math.PI / 180))/2);
        //周の長さ
        System.out.println(a + b + Math.sqrt(a*a + b*b - 2*a*b*Math.cos(c* (Math.PI / 180))));
        //a を底辺としたときの高さ h
        System.out.println(b*Math.sin(c* (Math.PI / 180)));
    }
}

