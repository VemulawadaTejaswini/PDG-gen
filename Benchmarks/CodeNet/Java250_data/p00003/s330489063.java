import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner input=new Scanner(System.in);
    ArrayList<String> list=new ArrayList<String>();
    int cases=input.nextInt();
    if(cases>=1 && cases<=1000)
    {
    for(int i=0;i<cases;i++)
    {
      int a=input.nextInt();
      int b=input.nextInt();
      int c=input.nextInt();
      if(a>=1 && b>=1 && c>=1 && a<=1000 && b<=1000 && c<=1000)
      {
         ArrayList<Integer> list1=new ArrayList<Integer>();
         list1.add(a);
         list1.add(b);
         list1.add(c);
         Collections.sort(list1);
         Double d=Math.pow(list1.get(0),2);
         Double e=Math.pow(list1.get(1),2);
         Double f=Math.pow(list1.get(2),2);
         if(d+e==f)
         {
         list.add("YES");
         }else
        list.add("NO");
      }
    }
    for(int i=0;i<list.size();i++)
    {
    System.out.println(list.get(i));
    }
    }
  }
}

     