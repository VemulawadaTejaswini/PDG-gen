import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long n = Long.parseLong(br.readLine());
    long[] num = new long[5];
    long minCapacity = Long.MAX_VALUE;
    for (int i=0; i<5; i++){
      num[i] = Long.parseLong(br.readLine());
      if (num[i] < minCapacity) minCapacity = num[i];
    }
    long result = 0;
    result += 5;
    if (n%minCapacity == 0){
      result += n/minCapacity-1;
    } else {
      result += n/minCapacity;
    }
    System.out.println(result);
  }
}
