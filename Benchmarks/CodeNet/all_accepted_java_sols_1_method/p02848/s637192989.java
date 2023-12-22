import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int k;
    String s;
    k=sc.nextInt();
    sc.nextLine();
    s=sc.nextLine();
    char ar[]=s.toCharArray();
    for(int i=0;i<ar.length;i++)
    ar[i]=(char)((ar[i]-65+k)%26+65);
    s=new String(ar);
    System.out.println(ar);
  }
}