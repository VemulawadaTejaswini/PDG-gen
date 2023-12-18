/* ITP1_4_D */
import java.io.*;

class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // input
    int quantity = Integer.parseInt(br.readLine());
    String[] str = br.readLine().split(" ");
    int min = 0;
    int max = 0;
    long sum = 0;

    for(int i = 0; i < quantity; i++){

      int value = Integer.parseInt(str[i]);

      if(i == 0){
        min = value;
        max = value;
        sum = value;
      }else {
        //check
        if(min > value)
          min = value;
        if(max < value)
          max = value;
        sum += value;
      }
    }
    // output
    System.out.println(min + " " + max + " " + sum);
  }
}