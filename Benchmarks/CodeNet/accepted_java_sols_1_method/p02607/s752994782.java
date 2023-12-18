import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
      	int a = Integer.parseInt(sc.nextLine());
      	int result = 0;
      	for(int i = 0; i < a; i++)
        {
         	if(sc.nextInt() % 2 == 1 && i % 2 == 0)
            {
             	result++; 
            }
        }
      
      	System.out.println(result);
    }
}