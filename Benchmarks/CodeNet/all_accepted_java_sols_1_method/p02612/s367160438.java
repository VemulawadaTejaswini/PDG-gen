import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            if(n<=i*1000)
            {
               System.out.println((i*1000)-n);
               break;
            }

        }
    }
}