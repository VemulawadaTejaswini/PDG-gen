import java.util.Scanner;

/**
 *
 * @author Suraj
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        String s= Integer.toString(n);
        int l=s.length();
        int p=(int) Math.pow(10, l-1);
        if(p==n){
            System.out.println(10);
        }
        else{
            int sum=0;
            int m;
            while(n > 0)
        {
            m = n % 10;
            sum = sum + m;
            n = n / 10;
        }
            System.out.println(sum);
        }
    }
    
}
