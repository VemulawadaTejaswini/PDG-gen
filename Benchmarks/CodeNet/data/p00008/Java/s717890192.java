import java.io.*;

class Main
{
 public static void main(String args[])throws IOException
 {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  for(;;)
  {
   int cnt=0;
   String str_n = br.readLine();
   if(str_n==null) break;
   int n = Integer.parseInt(str_n);
   for(int a = 0; a <= 9; a++)
   {
    for(int b = 0; b <= 9; b++)
    {
     for(int c = 0; c <= 9; c++)
     {
      for(int d = 0; d <= 9; d++)
      {
       if(a+b+c+d==n)
        cnt++;
      }
     }
    }
   }
   System.out.println(cnt);
  }
 }
}