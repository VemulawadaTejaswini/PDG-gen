import java.util.Scanner;

public class Main{
    public static double toti(int a, int b){
        double c = a * b / 3.305785;
         
        return c;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("%10f5",toti(sc.nextInt(),sc.nextInt()));
    }
}

