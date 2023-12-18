import java.util.Scanner;
 
class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int k =sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
 
        if(a%k==0||b%k==0)
        {
            System.out.print("OK");
        }
        else
        if((b/k)-(a)/k>=1)
        {
            System.out.print("OK");
        }
        else
        {
            System.out.print("NG");
        }
    }
}