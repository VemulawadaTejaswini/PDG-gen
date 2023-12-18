import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] a = new int[n];
    boolean [] b = new boolean[n];


    for (int i=0;i<n;i++){
      a[i] = scan.nextInt();
      b[i] = true;
    }

    Arrays.sort(a);

    long sum = 0;
    for (int i=0;i<n;i++){
      if (b[i] == false){
        continue;
      }

      for (int j=i+1;j<n;j++){
        if (b[j] == false){
          continue;
        }

        if ( (a[j] % a[i]) == 0){
          b[j] = false;
          if (a[j] == a[i]){
            b[i] = false;
          }
        }
      }
    }

    for (boolean f : b){
      if (f == true){
        sum += 1;
      }
    }

    System.out.println(sum);

  }

}
