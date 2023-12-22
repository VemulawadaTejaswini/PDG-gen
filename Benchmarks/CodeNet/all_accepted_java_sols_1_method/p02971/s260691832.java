import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int max_first = 0;
    int max_second = 0;
    int[] a = new int[n];
    for(int i=0; i<n; ++i){
      a[i] = sc.nextInt();
      if(max_first<=a[i]) {
        max_second=max_first;
        max_first=a[i];
      }
      if(max_first>a[i] && max_second<=a[i]) {
        max_second=a[i];
      }
    }
    for(int ii:a) {
      if(ii!=max_first)
        System.out.println(max_first);
      else if(ii!=0)
        System.out.println(max_second);
    }
  }
}