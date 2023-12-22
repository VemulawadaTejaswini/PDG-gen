import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String W, T;
        int count=0;
        
        W = sc.next();
        while(true)
        {
            T = sc.next();
            if(T.equals("END_OF_TEXT")) break;
            
            T = T.toLowerCase();

            String[] sT = T.split(" ");

            for(int i=0; i<sT.length; i++)
            {
                if(sT[i].equals(W)) count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
