import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	int c = sc.nextInt();
      	int add = 0; 
      	if(a % c == 0)
        {
         	 add++;
        }
      	System.out.println( (b / c) - (a / c) - add);
    }
}