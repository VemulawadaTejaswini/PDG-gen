import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    int n = 10, m = 3;
    int[] arr = new int[n];

    for (int i = 0; i < n; i++){
      arr[i] = new java.util.Scanner(System.in).nextInt();
    }

    Arrays.sort(arr);

    for (int i = n - 1; i >= n -m; i--){
      System.out.println(arr[i]);
    }
  }
}