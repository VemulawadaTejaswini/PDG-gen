import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        int arr[] = new int[5];

        for(int i=0 ; i< 5; i++)
        {
            arr[i] = k.nextInt();
            if(arr[i] == 0)
            {
                System.out.println(i+1);
            }
        }
    }
}