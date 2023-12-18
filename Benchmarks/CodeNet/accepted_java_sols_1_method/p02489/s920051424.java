import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int x;
        int count = 0;
        while((x = sc.nextInt() )!= 0)
        {
            count++;
            System.out.printf("Case %d: %d\n",count,x);
        }
    }
}