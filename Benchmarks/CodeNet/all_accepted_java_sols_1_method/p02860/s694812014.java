import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
      	String s = sc.next();
      	if (a%2==0)
        {
          String tmp = s.substring(0,a/2);
          
          if (s.equals(tmp+tmp))
          {
            System.out.println("Yes");
          }
          else
          {
          	System.out.println("No");
          }
        }
      	else
        {
          System.out.println("No");
        }
	}
}