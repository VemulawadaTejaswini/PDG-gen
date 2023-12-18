import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        char[] str = scanner.next().toCharArray();
        int N = scanner.nextInt();
        int[] dist = new int[str.length];
        for(int i=0; i<str.length; i++)
        {
            dist[i] = 'z' - str[i];
        }
        for(int i=0; i<str.length-1; i++)
        {
            if(str[i] != 'a' && dist[i] < N)
            {
                str[i] = 'a';
                N -= dist[i] + 1;
            }
        }
        N = N % 26;
        int distanceToA = 26 - dist[dist.length-1] - 1;
        str[str.length-1] = (char)('a' + ((distanceToA + N) % 26));
        System.out.println(new String(str));
    }
}