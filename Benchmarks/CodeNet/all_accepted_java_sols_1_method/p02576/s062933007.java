import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double x = sc.nextDouble();
        int t = sc.nextInt();
        System.out.println((int)(t * Math.ceil(n/x)));
        
    }
}

