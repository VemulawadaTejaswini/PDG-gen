import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
        if(c != 'z')
        {
            c++;
            System.out.println(c);

        }


    }
}