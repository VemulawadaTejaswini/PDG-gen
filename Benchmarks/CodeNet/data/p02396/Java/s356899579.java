
import java.util.Scanner;

public class Main{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 1;
        while (true){
            int check = sc.nextInt();
            if (check == 0)
                break;
            else
                System.out.println("Case " + count + ": " + check);
            count++;
        }
    }
}

