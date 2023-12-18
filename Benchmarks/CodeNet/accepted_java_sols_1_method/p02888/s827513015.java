import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] data = new int[n];
    int count = 0;

    for(int i = 0;i < n;i++) {
      data[i] = sc.nextInt();
    }

    Arrays.sort(data);

    for(int i = 0;i < n;i++) {
      for(int j = i+1;j < n;j++) {
        for(int k = j+1;k < n;k++) {
          if(data[k] < data[i] + data[j]) count++;
        }
      }
    }

    System.out.println(count);

  }

}
