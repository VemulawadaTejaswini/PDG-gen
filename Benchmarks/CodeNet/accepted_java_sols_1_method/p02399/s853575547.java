import java.util.*;
    public class Main{
        public static void main(String[] args){
            int a, b;
        	Scanner scan = new Scanner(System.in);
            a = scan.nextInt();
            b = scan.nextInt();
            System.out.printf("%d %d %.10f\n", a / b, a % b, (double)a / (double)b);
        }
    }
