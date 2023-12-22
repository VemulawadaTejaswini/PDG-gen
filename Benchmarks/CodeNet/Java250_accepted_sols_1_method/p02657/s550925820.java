import java.util.Scanner;
 
class Main
{
  public static void main(String args[])
  {
    int val;
    Scanner s = new Scanner(System.in);
	val = s.nextInt();
	val *= s.nextInt();
    System.out.println(val); 
  }
}