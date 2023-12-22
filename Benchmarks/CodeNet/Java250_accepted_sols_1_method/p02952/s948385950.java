
import java.util.Scanner;

/**
 *
 * @author cs18097
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for(int i = 1;i <= n;i++){
            String tmp = String.valueOf(i);
            if(tmp.length()%2==1)ans++;
        }
        
        
        System.out.print(ans);
        
        
    }
    
}
