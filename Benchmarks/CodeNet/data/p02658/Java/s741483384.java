import java.util.Scanner;
 
class Main
{
  public static void main(String args[])
  {
    int val;
    Scanner s = new Scanner(System.in);
    val = scan.nextInt();
	long sum = 0;
    
    for( int i =  0;i<val;i++)
    {
      sum += scan.nextLong();
      if( sum < 0 )
      {
        sum = -1;
        break;
      }
    }
    System.out.println(sum);
  }
}