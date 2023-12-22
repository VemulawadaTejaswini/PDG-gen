
import java.util.Scanner;

class Main
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        if (1 * a + 5 * b + 10 * c + 50 * d + 100 * e + 500 * f >= 1000){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

    }

}

