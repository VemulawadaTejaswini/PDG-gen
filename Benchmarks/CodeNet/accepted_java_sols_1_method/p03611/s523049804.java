import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] data = br.readLine().split(" ");
    int[] num = new int[100000];
    for (int i=0; i<n; i++){
      num[Integer.parseInt(data[i])]++;
    }
    int temp = 0;
    int max = 0;
    
    for (int i=0; i<=99997; i++){
      temp = num[i] + num[i+1] + num[i+2];
      if(temp>max) {
        max = temp;
      }
    }
    System.out.println(max);
  }
}