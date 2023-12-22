import java.util.Scanner;

public class Main {



    public static void main(String args[]){



        Scanner src = new Scanner(System.in);

        int d = src.nextInt();
        int t = src.nextInt();
        int s = src.nextInt();

        System.out.println((double)t >= (double)d/(double)s ? "Yes":"No");
    }
}