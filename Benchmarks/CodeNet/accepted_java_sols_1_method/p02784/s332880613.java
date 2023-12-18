import java.util.Scanner;

class Main{

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }

        if(sum>=h)
            System.out.println("Yes");
        else
            System.out.println("No");




    }
}
