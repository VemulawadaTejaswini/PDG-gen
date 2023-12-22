import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int sum=n/2;
        if(n%2!=0){
            sum++;
        }
        System.out.println(sum);
        sc.close();
    }
}