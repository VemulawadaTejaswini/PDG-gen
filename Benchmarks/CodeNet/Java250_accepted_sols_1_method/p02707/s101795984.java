import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public  static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int arr[] = new int[total];
        arr[0]= 0 ;

        for(int i=1;i<total;i++)
        {
            arr[i] = sc.nextInt();
        }
        int temp =0;
        //Arrays.sort(arr);
        int arrNew[] = new int[total];
        for(int i =1;i<total;i++)
        {
            arrNew[arr[i]-1] = arrNew[arr[i]-1]+1;
        }

        for(int i=0;i<total;i++)
        {
            System.out.println(arrNew[i]);
        }




    }
}
