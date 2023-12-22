import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int [] a = new int[n];
    boolean [] b = new boolean[n];
    for (int i=0;i<n;i++){
      a[i] = scan.nextInt();
    }

    for (int j=0;j<m;j++){
      int c = scan.nextInt();
      int d = scan.nextInt();
      int e = a[c-1];
      int f = a[d-1];
      if (e>f){
        b[d-1] = true;
      }
      else if(e<f){
        b[c-1] = true;
      }
      else{
        b[d-1] = true;
        b[c-1] = true;
      }
    }

    int sum=0;
    for (int k=0;k<n;k++){
      if (b[k] == false){
        sum += 1;
      }
    }

    System.out.println(sum);

  }
}
