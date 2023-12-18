import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int a,b;
            int x,y;
            double z;

            a = sc.nextInt();
            b = sc.nextInt();
            
            x = a / b;
            y = a % b;
            z = (double)a / b;

            System.out.println(x + " " + y + " " + String.format("%.5f", z));
        }
    }
}
