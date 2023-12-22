import java.util.*;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] a = new int[3*n];
    for(int i=0; i<a.length; i++){
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    long sum = 0;
    int i = a.length-2;
    while(i >= n){
      sum += a[i];
      i -= 2;
    }
    
    System.out.println(sum);

    sc.close();
  }
}