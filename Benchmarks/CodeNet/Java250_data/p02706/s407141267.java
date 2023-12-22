import java.util.Scanner;

/**
 *
 * @author Masaya Misaizu
 */
public class Main {
    private static int error =-1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a> Math.pow(10,6))
           {
               System.out.println(error);
               System.exit(0);
           }
        int b = sc.nextInt();
            if(b> Math.pow(10,4))
            {
                System.out.println(error);
                System.exit(0);
            }
        int sum = 0;
        for (int i = 0; i < b ; i++) {
            int c = sc.nextInt();
            if(c> Math.pow(10,4))
               {
                   System.out.println(error);
                   System.exit(0);
               }
            if(a>=sum)
                {
                    sum+=c;
                }
            else
                break;
            }
        if(a < sum){
            System.out.println(error);
        }
        else
            System.out.println(a-sum);
            
    

            }
}
