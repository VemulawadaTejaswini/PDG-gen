    import java.util.Scanner;

    class Main
    {
        public static void main(String args[])
        {
            int c=0;
            Scanner sc=new Scanner(System.in);
            long n=sc.nextLong();
            long arr[]=new long[64];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextLong();
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n-1; j++) {
                    if(arr[j]>arr[j+1])
                    {
                        long temp=arr[j];
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
