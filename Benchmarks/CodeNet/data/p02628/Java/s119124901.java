import java.util.*;
class Main {
  static Scanner scan = new Scanner(System.in);
  public static void main(String[] args) {
  	int N = scan.nextInt();
    int K = scan.nextInt();
    int[] arr = new int[N];
    takeInput(arr);
    System.out.println(minPrice(arr, K));
  }
  private static void takeInput(int[] arr) {
  	for(int i = 0; i < arr.length; i++) {
    	arr[i] = scan.nextInt();
    }
  }
  private static int minPrice(int[] arr, int K) {
  	Arrays.sort(arr);
    int sum = 0;
    for(int i = 0; i < K; i++) {
    	sum += arr[i];
    }
    return sum;
  }
}