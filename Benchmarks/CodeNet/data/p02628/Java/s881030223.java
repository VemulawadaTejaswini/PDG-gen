import java.util.*;
public class Main{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
    int sum=0;
    int k=sc.nextInt();
    ArrayList<Integer> a=new ArrayList<Integer>();
    for(int i=0;i<n;i++)
      a.add(sc.nextInt());
    Collections.sort(a);
    for(int y=0;y<k;y++)
    {
        sum=sum+a.get(y);
    }
    System.out.println(sum);
      
  }
}