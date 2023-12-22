import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String[] p = scan.next().split("");
        for (int i = 1; i <= 3; i++) {
            if (p[i - 1].equals(p[i])) {
                System.out.println("Bad");
                break;
            }
          if(i==3)
                  System.out.println("Good");
        }

    }
}