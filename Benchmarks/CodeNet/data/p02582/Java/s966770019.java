import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int n=s.length();
    int cnt=0;
    int max=0;
    for(int i=0;i<n;i++)
    {
      if(s.charAt(i)=='R')
      cnt++;
      else
      {
        max=Math.max(max,cnt);
        cnt=0;
      }     
    }
    max=Math.max(max,cnt);
    System.out.println(max);
  }
}