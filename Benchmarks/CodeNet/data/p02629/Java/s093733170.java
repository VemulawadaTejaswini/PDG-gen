import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    String s="";
    while(n>26)
    {
      if(n%26==0)
        s+='z';
      else
        s+=(char)(n%26+96);
      n/=26;
    }
    if(n%26==0)
    	s+='z';
    else
    	s+=(char)(n%26+96);
    StringBuilder sb=new StringBuilder();
    sb.append(s);
    System.out.println(sb.reverse());
  }
}