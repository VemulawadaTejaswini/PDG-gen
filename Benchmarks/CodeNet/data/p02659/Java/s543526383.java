import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        double B = sc.nextDouble();
        
        int C = (int)(B * 100);
        
        long D = (long)(A * C);
        
        System.out.print((long)(D / 100));
    }    
}