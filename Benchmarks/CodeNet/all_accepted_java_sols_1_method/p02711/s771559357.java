import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan1 = new Scanner(System.in);
        int num = scan1.nextInt();
        String res = "No";

        for (int i = 0; i < 3; i++)
        {
            if ((num/(int)Math.pow(10, i)) % 10 == 7) {
               res = "Yes";
                break;
            }
        }
        System.out.println(res);

    }
}
