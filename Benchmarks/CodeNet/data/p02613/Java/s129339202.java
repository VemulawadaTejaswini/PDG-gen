import java.util.*;
class Main
{
  public static void main(String args[])
  {
    int i,c1=0,c2=0,c3=0,c4=0;
  Scanner obj=new Scanner(System.in);
    int n=Integer.parseInt(obj.nextLine());
    String a[]=new String[n];
    for(i=0;i<n;i++)
      a[i]=obj.nextLine();
    for(i=0;i<n;i++)
    {
      switch(a[i])
      {
        case "AC":
          c1++;
          break;
        case "WA":
          	c2++;
          break;
        case "TLE":
          	c3++;
          	break;
        case "RE":
          c4++;
          break;
      }
      }
    System.out.println("AC x "+c1);
    System.out.println("WA x "+c2);
    System.out.println("TLE x "+c3);
    System.out.println("RE x "+c4);
    }
  }