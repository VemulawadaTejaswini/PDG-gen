
import java.util.Scanner;


public class Main 
{ 
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextInt();
        float dim = n/3;
        System.out.printf("%f\n",dim*dim*dim);
    }
}
