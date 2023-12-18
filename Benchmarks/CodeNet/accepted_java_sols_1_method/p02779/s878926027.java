import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    HashSet<Integer> set=new HashSet<>();
    int n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
      set.add(arr[i]);
    }
    if(set.size()==n)
    {
      System.out.println("YES");
    }
    else
    {
      System.out.println("NO");
    }
  }
}
      