import java.util.Scanner;
class Main
    {
        public static void main(String []args)
        {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int arr[] = new int[N];
            for(int i = 0;i<N;i++)
            {
                arr[i] = scan.nextInt();
            }
            int sum = 0;
            for(int i =0;i<N;i++)
            {
                sum  += arr[i];
            }
            int a = sum/N;
            int b = a+1;
            int aa = 0;
            int bb = 0;
            for(int i =0;i<N;i++)
            {
                aa += (a-arr[i])*(a-arr[i]);
                bb += (b-arr[i])*(b-arr[i]);
            }
            int ans;
            if(aa<bb)
            {
                ans =  aa;
            }
            else
            {
                ans = bb;
            }
            System.out.println(ans);
        }
    }
