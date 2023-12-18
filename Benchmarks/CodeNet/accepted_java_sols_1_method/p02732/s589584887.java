import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
    int n = Integer.parseInt(br.readLine());
    
    int[] a = new int[n];
    int[] b = new int[n];
    String[] data = br.readLine().split(" ");
    int temp;
    for (int i=0; i<n; i++){
      temp = Integer.parseInt(data[i])-1;
      a[temp]++;
      b[i] = temp;
    }
    long sum = 0;
    for (int i=0; i<n; i++){
      sum += ((long) a[i]*((long) a[i]-1))/2;
    }
    long result;
    for (int i=0; i<n; i++){
      result = sum - ((long) a[b[i]]*((long) a[b[i]]-1))/2 + ((long) (a[b[i]]-1)*((long) a[b[i]]-2))/2;
      System.out.println(result);
    }
  }
}
