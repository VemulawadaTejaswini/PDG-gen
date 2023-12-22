import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int all[] = new int[26];
        int i;

        for(i=0;i<all.length; i++) all[i]=0;

        while(sc.hasNext())
        {
            String input = sc.next();
            input = input.toLowerCase();
            input = input.trim();
            char c[] = input.toCharArray();
            
            for(i=0; i<c.length; i++)
            {
                int count=0;
                for(char a='a'; a<='z'; a++)
                {
                    if(c[i]==a)
                    {
                        all[count]++;
                        //System.out.println("got :"+c[i]); 
                    }
                    count++;
                }
            }
        }
        
        int ccount=0;
        for(char a='a'; a<='z'; a++)
        {
            System.out.println(a+" : "+all[ccount]);
            ccount++;
        }

        sc.close();
    }
}
