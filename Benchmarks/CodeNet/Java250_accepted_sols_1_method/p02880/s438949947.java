import java.util.*;
import java.math.*;
public class Main{
        public static void main(String args[])
        {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i=1;i<=9;i++){
                int x = n/i;
                int y = n%i;
                if(x<=9 && y==0){
                System.out.println("Yes");
                return;
                }
            }
            System.out.println("No");
        }
}
