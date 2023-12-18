import java.io.*;

class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());
    if(n < 3 || n > 10000) System.exit(-1);

    for(int i = 1; i <= n; i++){

      if(i % 3 == 0){
        sb.append(" " + i);
        continue;
      }

      int x = i;
      do{
        if(x % 10 == 3){
          sb.append(" " + i);
          break;
        }
        x /= 10;
      }while(x > 0);
    }
    System.out.println(sb);
  }
}