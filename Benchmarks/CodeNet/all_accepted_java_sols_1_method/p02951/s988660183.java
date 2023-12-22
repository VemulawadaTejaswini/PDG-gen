import java.io.*;

public class Main{
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] line = br.readLine().split(" ");
    int[] nums = new int[3];
    for(int i=0; i<3; i++)
      nums[i] = Integer.parseInt(line[i]);
    System.out.println(Math.max(nums[2]-(nums[0]-nums[1]), 0));
  }
}
