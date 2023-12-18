import java.util.Scanner;

/**
 *
 * @author ryo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int N = 1;
    while(true)
        {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int num = Integer.parseInt(str);
        if(num != 0)
            {
            System.out.println("Case "+N+": "+num);
            N +=1;
            }else{
            break;
            }
        }
    }
    
}