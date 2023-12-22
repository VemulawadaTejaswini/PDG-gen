import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l = sc.nextInt();
    int total = 0;
    int a[] = new int[n];
    int x[] = new int[n];
    int min = 0;
    for(int i=0 ; i<n ; i++){
      a[i] = i+l;
      total = total + a[i];
    }
    for(int i=0 ; i<n ; i++){
      if(Math.abs(a[i])<=Math.abs(a[min])){
        min = i;
      }
    }
    System.out.println(total-a[min]);
  }
}
