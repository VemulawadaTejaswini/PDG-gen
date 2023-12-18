import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        int c=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[32];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]<arr[i+1])
                c++;
            else
                continue;
        }
        System.out.println(c);
    }
}
