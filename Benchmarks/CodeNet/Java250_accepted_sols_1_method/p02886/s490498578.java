import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] array = new int[n];
    for(int i=0; i<n; i++){
      array[i] = sc.nextInt();
    }

    int sum = 0;
    int v1 = 0;
    int v2 = 0;

    for(int i=0; i<n;i++){
        v1 = array[i];
      for(int j=i+1; j<n; j++){
        v2 = array[j];
        sum += v1 * v2;
      }
    }

    System.out.println(sum);
  }

}