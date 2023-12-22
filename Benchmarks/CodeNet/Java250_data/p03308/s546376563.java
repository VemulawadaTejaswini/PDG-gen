import java.util.*;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] a = new int[n];
    int min = 0, max = 0;
    for(int i=0; i<n; i++){
      if(i==0){
        a[i] = sc.nextInt();
        min = a[i];
        max = a[i];
      } else {
        a[i] = sc.nextInt();
        if(min > a[i]){
          min = a[i];
        } else if(max < a[i]){
          max = a[i];
        }
      }
    }
    System.out.println(max - min);

    sc.close();
  }
}
