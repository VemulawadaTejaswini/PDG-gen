import java.util.*;
import java.lang.*;
public class main{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int m=s.nextInt();
    int n=s.nextInt();
    int k=s.nextInt();
    ArrayList ar=new ArrayList();
    for(int i=0;i<m;i++)
      ar.add(s.nextInt());
    for(int j=0;j<n;j++)
      ar.add(s.nextInt());
    ar.sort();
    int sum=0;
    int count=0;
    for(int j=ar.begin();j<=ar.end();j++)
    {
      if(sum+ar[j]<k)
      {
        sum=sum+ar[j];
        count+=1;
      }
    System.out.println(count);
  	}
}
}  