import java.util.*;

public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    ArrayList<Integer> al=new ArrayList();
    for(int i=0;i<N;i++)
      al.add(sc.nextInt());
    Collections.sort(al);
    int cnt=al.get(N-1);
    int j=N-2,k=0;
    for(int i=N-3;i>=0;i--)
    {
      if(k==2)
      {
        j--;
        k=0;
      }
      k++;
      cnt+=al.get(j);      
    }
    System.out.println(cnt);
  }
}