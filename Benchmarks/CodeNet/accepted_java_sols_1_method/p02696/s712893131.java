import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double n = scanner.nextDouble();
        double x = 0.0;
        if(b <= n){
            x = b - 1.0;
        }else{
            x = n;
        }
        System.out.println((int)(Math.floor(a * x / b) - a * Math.floor(x / b)));
    }
}

