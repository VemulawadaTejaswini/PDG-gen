import java.util.Scanner ;

public class Main
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    
    int i , j , c ;
    
    for(i=1;i<=9;i++)
    {
      for(j=1;j<=9;j++)
      {
        c= i * j ;
        
        System.out.println(i+"X"+j+"="+c);
      }
    }
  }
}