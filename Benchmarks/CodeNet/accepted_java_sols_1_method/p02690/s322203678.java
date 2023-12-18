import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        long x = Long.parseLong(line);
        
        int a = 0;
        int b = 0;
        
        boolean flag = true;
        for(a = 1; a < 1000; a++)
        {
            
            for(b = -999; b < a; b++)
            {
                long aa = (long)Math.pow(a,5);
                long bb = (long)Math.pow(b,5);
                long result = aa - bb;
                
                if(result == x)
                {
                    flag = false;
                    break;
                }
            }
            if(flag == false)
            {
                break;
            }
            
        }
        
        System.out.println(a + " " + b);
    }
}
