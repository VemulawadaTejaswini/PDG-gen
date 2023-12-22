import java.util.*;

public class Main{

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] data = new int[n];

    for(int i = 0;i < data.length;i++) data[i] = sc.nextInt();

    Arrays.sort(data);

    double sum = data[0];

    for(int i = 1;i < n;i++){
      sum += data[i];
      sum /= 2;
    }

    System.out.println(sum);

  }

}
