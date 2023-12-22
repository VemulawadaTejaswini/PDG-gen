import java.util.Arrays;
import java.util.Scanner;

class Main{

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();
        long k = sc.nextInt();

        long[] arr = new long[(int)n];

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        if(k>=n)
        {
            System.out.println(0);
        }
        else
        {
            long monleft = n-k;
            //System.out.println(monleft);
            long sum=0;

            for (int i = 0; i <(monleft) ; i++)
            {
                sum+=arr[i];
            }

            System.out.println(sum);

        }


    }
}
