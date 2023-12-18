import java.io.*;

class ITP1_3_C
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str1 = br.readLine();
    int x = Integer.parseInt(str1);
    String str2 = br.readLine();
    int y = Integer.parseInt(str2);

    while(x != 0 || y != 0){
      if(x > y){
        System.out.println(y + " " + x);
      }else{
        System.out.println(x + " " + y);
      }

      str1 = br.readLine();
      x = Integer.parseInt(str1);
      str2 = br.readLine();
      y = Integer.parseInt(str2);
    }
  }
}