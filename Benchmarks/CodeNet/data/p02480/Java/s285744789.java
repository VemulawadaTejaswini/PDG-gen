public class Main
{
   public static void main(String[] args)
   {
      int x;
      try{
         InputStreamReader isr=new InputStreamReader(System.in);
         BufferedReader br=new BufferedReader(isr);
         String s=br.readLine();
         x=Integer.parseInt(s);
      }
      catch(Exception e){}
      System.out.println(x*x*x);
   }
}