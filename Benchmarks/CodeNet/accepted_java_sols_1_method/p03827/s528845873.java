import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int nouse = scan.nextInt();
        String s = scan.next();
        
        int x = 0;
        int max = 0;
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == 'I')
            {
                x++;
                if(x>max)
                {
                    max = x;
                }
            }
            else
            {
                x--;
            }
        }
        System.out.println(max);
    }
}