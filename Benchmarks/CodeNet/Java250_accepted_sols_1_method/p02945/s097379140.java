import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();
    int best = a;
    int[] arr = new int[]{ a + b, a - b, a * b};
    for(int i = 0; i < arr.length; i++) best = Math.max(best, arr[i]);
    System.out.println(best);
  }
 }
    