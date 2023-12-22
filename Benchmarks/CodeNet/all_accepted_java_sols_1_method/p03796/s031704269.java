import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long power = 1;
        for (int i = 0; i < n; i++) {
            power *= (i + 1);
            power %= (1000000000 + 7);
        }
        

        System.out.println(power);
    }

}