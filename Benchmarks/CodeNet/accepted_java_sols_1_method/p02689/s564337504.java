import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {



    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            int m =sc.nextInt();
            int arr[]=new int[n];

            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int checkArr[] =new int[n];

            for(int i=-0;i<m;i++)
            {
                int a =sc.nextInt()-1;
                int b=sc.nextInt()-1;
                if(arr[b]>arr[a])
                {
                    checkArr[a]=-1;
                }
                else if(arr[a]>arr[b])
                {
                    checkArr[b]=-1;
                }
                else
                {
                    checkArr[a]=-1;
                    checkArr[b]=-1;
                }
            }
            int count =0;
            for(int i=0;i<n;i++)
            {
                if(checkArr[i]!=(-1))
                {
                    count=count+1;
                }
            }
            System.out.println(count);

    }


}