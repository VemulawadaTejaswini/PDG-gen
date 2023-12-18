import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] array = sc.nextLine().split("[\\s]");
            int n1 = Integer.parseInt(array[0]);
            int n2 = Integer.parseInt(array[1]);

            int num = n1 + n2;
            System.out.println(Integer.toString(num).length());
        }
        sc.close();

    }

}