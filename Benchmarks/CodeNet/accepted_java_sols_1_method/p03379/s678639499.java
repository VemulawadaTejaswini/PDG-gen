import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr1 = new int[n];
    int[] arr2 = new int[n];
    for(int i = 0; i < n; i++) {
      int tmp = sc.nextInt();
      arr1[i] = tmp;
      arr2[i] = tmp;
    }
    Arrays.sort(arr1);
    int center_1 = arr1[n / 2 - 1];
    int center_2 = arr1[n / 2];
    for(int i = 0; i < n; i++) {
      if(center_1 == arr2[i]) {
        System.out.println(center_2);
      } else if(center_2 == arr2[i]) {
        System.out.println(center_1);
      } else if(arr2[i] < center_1 && arr2[i] < center_2) {
        System.out.println(center_2);
      } else if(arr2[i] > center_1 && arr2[i] > center_2) {
        System.out.println(center_1);
      }
    }
  }
}
