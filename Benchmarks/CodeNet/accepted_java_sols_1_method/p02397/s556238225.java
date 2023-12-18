import java.util.Scanner;

/**
 *
 * @author k17075kk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        int x,y;
        Scanner sc = new Scanner(System.in);
        while(true){
            x = sc.nextInt();
            y = sc.nextInt();
            if (x == 0 && y == 0) break;
            if(x>y){
                System.out.println(y + " " + x);
            }else{
                System.out.println(x + " " + y);
            }
        }
    }
}
