import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[8];
    for (int i = 0; i < n; i++) {
      String str = sc.next();
      for (int j = 0; j < 8; j++) {
        arr[j] = (int)(str.charAt(j)-'0');
      }
      Arrays.sort(arr);
      int max = 0;
      int min = 0;
      for (int j = 0; j < 8; j++) {
        max += arr[j]*Math.pow(10,j);
        min += arr[7-j]*Math.pow(10,j);
      }
      System.out.println(max-min);
    }
  }
}