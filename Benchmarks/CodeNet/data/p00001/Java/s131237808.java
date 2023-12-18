import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main{

  public static void main(String [] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int [] moun = new int[10];
    for(int i = 0; i < 10; i++)
      moun[i] = Integer.parseInt(br.readLine());
    Arrays.sort(moun);
    System.out.println(moun[9]);
    System.out.println(moun[8]);
    System.out.println(moun[7]);
  
  }


}