import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    int wk;
    for (int i = 0; i < n; i++) {
      int arr[i] = sc.nextInt();
    }
    int h = n/1.3;
    while (true) {
      int swaps = 0;
      for (int i = 0; i+h < n; i++) {
        if (arr[i] > arr[i+h]) {
          wk = arr[i+h];
          arr[i+h] = arr[i];
          arr[i] = wk
          swaps++
        }
      if (h == 1) {
        if (swaps == 0) {
          break;
        }
      }
      else {
        h = h*10/13;
      }
    }
    for (int i = 0; i < n-1; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println(arr[n]);
  }
}