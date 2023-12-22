import java.util.Scanner;

public class Main {

    public static void main(String []args){
        Scanner in = new Scanner(System.in);

        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();


        if(a==b && b==c)
        {
            System.out.println("No");
        }
        else{
            if(a==b || b==c || a==c)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }

    }

}
