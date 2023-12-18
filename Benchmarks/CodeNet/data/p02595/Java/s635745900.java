import java.util.*;
class Main
{
  public static void main(String args[])
  {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	 int d=sc.nextInt();
    int count=0l
    	for(int i=0;i<n;i++)
        {
          	int x=sc.nextInt();
          int y=sc.nextInt();
          if(Math.sqrt(Math.pow(x,2)+Math.pow(y,2))<=d)
            count++;
        }
    System.out.println(count);
  }
}