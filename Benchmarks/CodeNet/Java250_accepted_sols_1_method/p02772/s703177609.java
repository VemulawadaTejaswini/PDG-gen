import java.util.Scanner;

public class Main {

    public static void main(String []args){
        Scanner in = new Scanner(System.in);

        int n;
        n = in.nextInt();

        long[] array = new long[n];

        boolean flg = true;

        for(int i = 0;i<n; i++)
        {
            array[i] = in.nextLong();
            if(array[i]%2 == 0)
            {
                if((array[i]%3)*(array[i]%5) != 0)
                {
                    flg = false;
                }
            }
        }

        if(flg)
        {
            System.out.println("APPROVED");
        }
        else{
            System.out.println("DENIED");
        }



    }

}
