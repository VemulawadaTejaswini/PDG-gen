import java.io.*;
public class Main
{
  public static void main(String args[]) throws IOException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      
      int i,N,A,B,sum=0,c,copy;
      
      //System.out.println();
      
      String s[]=br.readLine().trim().split(" ");
      
      N=Integer.parseInt(s[0]);
      A=Integer.parseInt(s[1]);
      B=Integer.parseInt(s[2]);
      
      for(i=1;i<=N;i++)
      {
          copy=i;
          c=0;
          while(copy>0)
          {
              c+=copy%10;
              copy/=10;
          }
          
          if(c>=A&&c<=B)
          sum+=i;
      }
      System.out.println(sum);
    }
}