
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        int y = a.nextInt();
        if(x>y)
            System.out.println("a > b");
        else if (x<y)
            System.out.println("a < b");
        else if (x==y)
            System.out.println("a == b");
        }
    }