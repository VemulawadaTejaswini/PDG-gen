import java.util.*;

class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Integer a[] = new Integer[n];
    Integer b[] = new Integer[n];
    for (int i=0; i<n; i++){
      a[i] = sc.nextInt();
    }
    for (int i=0; i<n; i++){
      b[i] = sc.nextInt();
    }
    int sum =0;   
    for (int i=0; i<n; i++){
      int v = a[i] -b[i];
      if (v>0){
        sum += v;
      }
    }
    System.out.println(sum);
  }
}