import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int total = 0;
    int[] array = new int[n];

    for(int i=0 ; i<n; i++){
      array[i] = sc.nextInt();
    }

    Arrays.sort(array);

    for(int i=0; i<k; i++){
      total += array[i];
    }

    System.out.println(total);
  }
}