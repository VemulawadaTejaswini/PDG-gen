import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int count = 0;
    int n = sc.nextInt();
    int h[] = new int[n];
    int max = 1;
    for (int i = 0; i < n; i++){
      h[i] = sc.nextInt();
      if (h[i] >= max) {
        count++;
        max = h[i];
      }
    }
    System.out.println(count);
  }
}
