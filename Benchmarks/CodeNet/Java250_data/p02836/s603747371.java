import java.util.*;
public class Main
{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int cntr=0;
    for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--)
    {
      if(s.charAt(i)!=s.charAt(j))
        cntr++;
    }
    System.out.println(cntr);
  }
}
