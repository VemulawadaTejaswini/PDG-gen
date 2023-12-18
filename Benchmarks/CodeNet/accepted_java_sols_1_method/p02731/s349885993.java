import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        double l=scan.nextDouble();
        double tmp = l/3;
        System.out.println(tmp*tmp*tmp);
    }
}