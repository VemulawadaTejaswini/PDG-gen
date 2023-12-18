import java.util.*;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int x = sc.nextInt();
    int[] a = new int[n];
    for(int i=0; i<n; i++){
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    int count = 0;
    for(int i=0; i<n; i++){
      if(x >= 0 && x >= a[i]){
        x -= a[i];
      } else {
        count++;
      }
    }
    if(count != 0){
      System.out.println(a.length-count);
    } else if(count == 0 && x == 0){
      System.out.println(a.length);
    } else {
      System.out.println(a.length-1);
    }

    sc.close();
  }
}