import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.next();
        int res = string.length() - 2;
        if (string.charAt(0) != string.charAt(string.length() - 1))
        {
            if (res % 2 == 0)
                System.out.println("Second");
            else
                System.out.println("First");
        }
        else{
            if(res%2==0)
                System.out.println("First");
            else
                System.out.println("Second");
        }
    }
}
