import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner reader= new Scanner(System.in);
    int n=reader.nextInt();
    int m=reader.nextInt();
    int a=0;
    for(int i=0;i<m;i++)
    {
      a+=reader.nextInt();
    }
    if(n-a>=0)
    {
      System.out.println(n-a);
    }else
    {
      System.out.println("-1");
    }




  }
}