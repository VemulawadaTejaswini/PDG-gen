import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    
    int[] l = new int[n];
    for(int i = 0;i < n;i++){
      l[i] = sc.nextInt();
    }
    Arrays.sort(l);
    int max_length = 0;
    for(int i = n-k;i < n;i++){
      max_length = max_length + l[i];
    }
    System.out.println(max_length);
  }
}