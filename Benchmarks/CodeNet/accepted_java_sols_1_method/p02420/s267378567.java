

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,m;
        StringBuilder sb = new StringBuilder();
        String s;
        StringBuilder temp = new StringBuilder();
        while(true)
        {
            s= sc.next();
            if(s.compareTo("-")==0) break;
            else
            {
              m = sc.nextInt();
              for(int i = 0; i<m;i++)
              {
                  temp = temp.delete(0, temp.length());
                  n = sc.nextInt();
                  temp = temp.append(s);
                   s = s.substring(n);
                  if(n!=temp.length()) temp.delete(n,temp.length()+1);
                  s = s.concat(temp.toString());
              }
              System.out.println(s);
            }
        }
    }
}
