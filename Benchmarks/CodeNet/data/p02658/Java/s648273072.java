import java.util.*;
public class Main 
{
	public static void main(String[] args)
    {
      long mul = 1;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        while(num >= 0)
        {
          int b = sc.nextInt();
          mul *= b;
          num--;
        }
      if(mul < 1000000000000000000)
		System.out.println(mul);
      else
        System.out.println(-1);
	}
}