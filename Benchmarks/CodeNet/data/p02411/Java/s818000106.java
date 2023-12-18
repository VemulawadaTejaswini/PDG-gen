import java.io.*;

class Main
{
    public static void main (String[ ] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true)
        {
            String str[] = br.readLine().split(" ");
            int m = Integer.parseInt(str[0]);
            int f = Integer.parseInt(str[1]);
            int r = Integer.parseInt(str[2]);
            
            if(-1 == m && -1 == f && -1 == r)
            {
                break;
            }
            
            if(-1 == m || -1 == f)
            {
                System.out.println("F");
            }
            else if(80 <= m + f)
            {
                System.out.println("A");
            }
            else if(65 <= m + f)
            {
                System.out.println("B");
            }
            else if(50 <= m + f)
            {
                System.out.println("C");
            }
            else if(30 <= m + f)
            {
                if(50 <= r)
                {
                    System.out.println("C");
                }
                else
                {
                    System.out.println("D");
                }
            }
            else
            {
                System.out.println("F");
            }
        }
    }
}