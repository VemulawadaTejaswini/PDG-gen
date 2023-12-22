import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])throws Exception
  {
    Scanner Sc=new Scanner(System.in);
    int n=Sc.nextInt();
    double sum=0;
    ArrayList<Integer> list=new ArrayList<>();
    for(int i=0;i<n;i++)
    {
      list.add(Sc.nextInt());
    }
    Collections.sort(list);
    sum=list.get(0);
    for(int i=1;i<n;i++)
    {
        int a=list.get(i);
        sum=(sum+a)/2;
    }
    System.out.println(sum);
  }
}