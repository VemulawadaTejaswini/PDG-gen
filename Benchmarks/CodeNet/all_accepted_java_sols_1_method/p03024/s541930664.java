import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String record = input.nextLine();
        int len = record.length(),
            losses = 0;
        for(int i = 0; i < len; i++)
        {
            if(record.charAt(i) == 'x')
                losses++;
        }
        
        if(losses > 7)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
    
}