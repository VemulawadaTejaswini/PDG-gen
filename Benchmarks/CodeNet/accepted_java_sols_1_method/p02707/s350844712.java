import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner reader=new Scanner(System.in);
    int n=reader.nextInt();
    int buka[]=new int[n+1];
    int number[]=new int[n+1];
    buka[0]=0;
    for(int i=0;i<n;i++)
    {
      number[i]=0;
    }
    for(int i=2;i<=n;i++)
    {
      buka[i]=reader.nextInt();

      number[buka[i]]++;

    }
    for(int i=1;i<=n;i++)
  System.out.println(number[i]);










  }
}