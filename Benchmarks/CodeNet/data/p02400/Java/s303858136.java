import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        //入力準備
        Scanner sc = new Scanner(System.in);
        
        double r = sc.nextDouble();
        
        System.out.print(String.format("%.6f",r*r*Math.PI));
        System.out.print(" ");
        System.out.println(String.format("%.6f",2*r*Math.PI));
        
    }
}

