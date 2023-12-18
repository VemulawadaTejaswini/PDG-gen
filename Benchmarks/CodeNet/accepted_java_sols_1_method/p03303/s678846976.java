
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int n = sc.nextInt();
        int m = s.length();


        for(int i = 0;i < m;i++){//i=0,1,2,,,,n-1 で動作
            if(i%n == 0)
                System.out.print(s.charAt(i));
        }



//        System.out.println(ans);
    }
}