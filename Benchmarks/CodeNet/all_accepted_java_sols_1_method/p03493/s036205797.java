import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                String[] a = scan.nextLine().split("");

                int count = 0;
                if("1".equals(a[0]))
                    count++;

                if("1".equals(a[1]))
                    count++;
                if("1".equals(a[2]))
                    count++;
                System.out.print(count);

            }
}
