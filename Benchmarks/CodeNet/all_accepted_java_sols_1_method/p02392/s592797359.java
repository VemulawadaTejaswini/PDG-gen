
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        int y = a.nextInt();
        int z = a.nextInt();
        if(y>x && z>y)
            System.out.println("Yes");
        else
            System.out.println("No");
        }
    }