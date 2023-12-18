import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int data[] = new int[n];
        for(int i=0; i<n; i++) data[i]=sc.nextInt();
        
        for(int i=n-1; i>0; i--) System.out.printf("%d ",data[i]);
        System.out.printf("%d\n",data[0]);
        sc.close();
    }
}
