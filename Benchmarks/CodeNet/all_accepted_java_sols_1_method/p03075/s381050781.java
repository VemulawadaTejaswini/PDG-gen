
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(), e = sc.nextInt(), k = sc.nextInt();

        if(Math.abs(a-b) > k)
            System.out.println(":(");
        else if(Math.abs(a-c) > k)
            System.out.println(":(");
        else if(Math.abs(a-d) > k)
            System.out.println(":(");
        else if(Math.abs(a-e) > k)
            System.out.println(":(");
        else if(Math.abs(b-c) > k)
            System.out.println(":(");
        else if(Math.abs(b-d) > k)
            System.out.println(":(");
        else if(Math.abs(b-e) > k)
            System.out.println(":(");
        else if(Math.abs(c-d) > k)
            System.out.println(":(");
        else if(Math.abs(c-e) > k)
            System.out.println(":(");
        else if(Math.abs(e-d) > k)
            System.out.println(":(");
        else
            System.out.println("Yay!");
    }


}
