
import java.util.Scanner;

class Main
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int L = sc.nextInt();;
        System.out.println((D/L)+(D%=L));

    }

}

