import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Integer[] d1 = new Integer[n];
    for(int i = 0; i < n; i++){
      d1[i] = sc.nextInt();
    }
    Arrays.sort(d1, Collections.reverseOrder());

    int count = 1;
    for(int i = 0; i+1 < n; i++){
      if(d1[i] > d1[i+1]){
        count++;
      }
    }
    System.out.println(count);
  }
}
