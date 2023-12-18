import java.lang.Math
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.printf("%f %f",(double)((a+a)*Math.PI),(double)(a*a*Math.PI));
        sc.close();
    }
}

