import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=0;
        for(int i=a;i<=b;i++)
        {
            if(i%k==0)
            {
                x=1;
                System.out.println("OK");
                break;
            }
        }
        if(x==0)
            System.out.println("NG");
    }
}