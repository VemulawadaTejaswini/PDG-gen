import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] b = new int[n-1];
    for (int i=0;i<n-1;i++){
      b[i] = scan.nextInt();
    }
    int sum = b[n-2]+b[0];
    for (int j=n-2;j>=1;j--){
      sum += b[j];
      if (b[j-1] < b[j]){
        sum += b[j-1] - b[j];
      }
    }

    System.out.println(sum);

  }
}
