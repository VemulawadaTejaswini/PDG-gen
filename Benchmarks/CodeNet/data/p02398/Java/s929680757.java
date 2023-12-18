import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, c = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        int number = 0;
        
        for (int i = a; i < b; i++) {
            if (c % i == 0)  
                number++;
        }
        
        System.out.println(number);

    }

}

