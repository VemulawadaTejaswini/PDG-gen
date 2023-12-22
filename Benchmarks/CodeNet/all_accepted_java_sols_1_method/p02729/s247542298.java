import java.util.*;
import java.io.*;
 
public class Main {

  public static void main(String[] args)throws IOException
  {
      InputStreamReader read =new InputStreamReader(System.in);
      BufferedReader b=new BufferedReader(read);
      
      String st=b.readLine();
      String[] a=st.split(" ");
      int n=Integer.parseInt(a[0]);
      int m=Integer.parseInt(a[1]);
      int w=0;
      if(n>1 && m>1)
      w= (n*(n-1) + m*(m-1))/2 ;
      else if(n>1 && m<2)
      w=(n*(n-1))/2;
      else if(n<2 && m<2)
      w=0;
      else if(n<2 && m>1)
      w=(m*(m-1))/2;
      
      System.out.println(w);
  }
}
      
      