import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        String S,T;
        Scanner si=new Scanner(System.in);
        S=si.nextLine();
        T=si.nextLine();
        int i,j=0,count=0;
        for(i=0;i<S.length();i++)
        {
            if(S.charAt(i)!=T.charAt(j))
            {
                count++;
                j++;
            }
            else
            {
                j++;
            }
        }
        System.out.println(count);
    }
}
