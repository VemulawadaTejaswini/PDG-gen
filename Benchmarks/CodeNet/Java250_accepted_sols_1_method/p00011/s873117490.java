import java.io.*;
class Main {
  public static void main(String... args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    int w = Integer.parseInt(s);
    int[] nums = new int[w];
    for(int i = 0; i < w; i++) {
      nums[i] = i+1;
    }
    s = br.readLine();
    int n = Integer.parseInt(s);
    for(int i = 0; i < n; i++) {
      s = br.readLine();
      String[] arr = s.split(",");
      int a = Integer.parseInt(arr[0])-1;
      int b = Integer.parseInt(arr[1])-1;
      int temp = nums[a];
      nums[a] = nums[b];
      nums[b] = temp;
    }
    for(int i = 0; i < w; i++) {
      System.out.println(nums[i]);
    }
  }
}