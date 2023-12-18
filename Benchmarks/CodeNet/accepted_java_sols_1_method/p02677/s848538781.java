import java.util.Scanner;
public class Main {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        double A=scan.nextInt();
        double B=scan.nextInt();
        double H=scan.nextInt();
        double M=scan.nextInt();

        double L=Math.sqrt(Math.pow(A,2)+Math.pow(B,2)-2*A*B*Math.cos(Math.toRadians(M*5.5-H*30)));
        System.out.println(L);
    }
    }



