import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int[] a = new int[n];
    for(int i=0; i<n; i++) {
      a[i] = Integer.parseInt(in.readLine());
    }
    
    int count = 0;
    int currentButton = a[0];
    int[] ary = new int[n];
    boolean hantei = false;
    for(int i=0; i<n; i++) {
      if(currentButton==2) {
        count++;
        System.out.println(count);
        return;
      } else {
        count++;
        ary[currentButton-1]++;
        currentButton=a[currentButton-1];
      }
    }
    System.out.println(-1);
  }
}