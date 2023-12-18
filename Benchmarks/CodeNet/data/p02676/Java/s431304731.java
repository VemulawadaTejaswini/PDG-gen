import java.util.*;

public class Main
{
    public static void main(String[] args )
    {
        Scanner scan = new Scanner(System.in);
    
        int K = scan.nextInt();

        String S = scan.next();

        if(S.length() > K){

            System.out.println(S.substring(0, K)+"...");

        }else{
            System.out.println(S);
        }
    }
}
