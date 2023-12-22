import java.io.*;

class Main
{
   public static void main(String[] args) throws IOException
   {

      BufferedReader br =
       new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      int x = Integer.parseInt(str);

      //System.out.println( x^3 );   // ^はJavaでは○乗ではなくXORビット演算
      System.out.println( x*x*x );            // <= 正解
      //System.out.println( Math.pow(x,3) );  // Math.pow はdouble型を返す。
      //System.out.println( (int)Math.pow(x,3) ); // <= 正解

   }
}
