import java.io.*;

class ITP1_3_C
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while(true){

      String str[] = br.readLine().split(" ",0);
      int x = Integer.parseInt(str[0]);
      int y = Integer.parseInt(str[1]);
      if(x == 0 && y == 0) break;

      if(x > y){
        System.out.println(y + " " + x);
      }else{
        System.out.println(x + " " + y);
      }

    }
  }
}