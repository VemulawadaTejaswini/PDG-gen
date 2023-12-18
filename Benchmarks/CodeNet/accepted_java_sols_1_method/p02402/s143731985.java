import java.io.*;

class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // input
    int quantity = Integer.parseInt(br.readLine());
    String[] str = br.readLine().split(" ");
    long min = 1000000;
    long max = -1000000;
    long sum = 0;

    for(int i = 0; i < quantity; i++){

      long value = Integer.parseInt(str[i]);

      //check
      if(min > value)
        min = value;
      if(max < value)
        max = value;
      sum += value;
    }
    // output
    System.out.println(min + " " + max + " " + sum);
  }
}