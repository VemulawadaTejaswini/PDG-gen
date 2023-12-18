import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double menseki = r * r * Math.PI ;
        double enshu = r * 2 * Math.PI;
        System.out.println(String.format("%.6f" +" "+ "%.6f",menseki,enshu));
        sc.close();
    }
}
