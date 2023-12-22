import java.util.*;
class Main{
    public static void main(String[] args)
    {
        int  n[] = new int[3];   
        try (Scanner scanner = new Scanner(System.in))
        {
        
            for(int i = 0; i < 3; i++)
            {
                n[i] = scanner.nextInt();
            }
        }
        System.out.println(Main.Calculation(n[0], n[1], n[2]));
    }
    public static int Calculation(int a, int b, int c)
    {
        int train, result;
        train = b * a;
        result = c;
        if(train < c)
        {
            result = train;
        }
        return result;
    }
}