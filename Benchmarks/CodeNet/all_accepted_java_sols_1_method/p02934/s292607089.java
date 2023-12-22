import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sumaFraccion = 0;
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            double Ai= in.nextDouble();
            sumaFraccion+= 1.0/Ai;
            
        }
        double resutlado = 1/sumaFraccion;
        System.out.println(resutlado);
    }
}