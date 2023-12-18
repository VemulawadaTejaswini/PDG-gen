import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    float total = 0;
    int counter = 0;
    int[] a = new int[n];
    
    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
      total += a[i];
    }
    float p = total / (4 * m);
    
    for(int i = 0; i < n; i++){
      if(a[i] >= p){
        counter++;
      }
    }
    if(counter >= m){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}