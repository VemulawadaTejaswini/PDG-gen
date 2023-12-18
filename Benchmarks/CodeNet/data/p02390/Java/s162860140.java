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
        int a = sc.nextInt();
        int h = a/3600;
        int m = a%3600/60;
        int s = a%3600%60;
        
        System.out.println(h + ":" +m + ":" + s);
    }
    
}

