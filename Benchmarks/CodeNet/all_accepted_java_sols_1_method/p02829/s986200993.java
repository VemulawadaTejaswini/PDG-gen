import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int A;
        int B;

        A=sc.nextInt();
        B=sc.nextInt();

        if (A==2)
            if (B==1)
                System.out.println(3);
            else
                System.out.println(1);
        else
            if (A==1)
                if (B==2)
                    System.out.println(3);
                else
                    System.out.println(2);

            else
                if (B==2)
                    System.out.println(1);
                else
                    System.out.println(2);
    }
}
