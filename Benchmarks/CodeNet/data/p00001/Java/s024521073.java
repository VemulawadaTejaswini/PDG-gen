import java.util.*;

public class yama
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] mt = new int[10];
            for(int i=0; i<10; i++)
            {
                mt[i] = sc.nextInt();
            }
                Arrays.sort(mt);
                    for(int i=0; i<3; i++)
                    {
                        System.out.println(mt[9-i]);
                    }
    }
}