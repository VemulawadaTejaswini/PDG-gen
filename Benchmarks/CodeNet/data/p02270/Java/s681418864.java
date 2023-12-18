import java.io.*;
import java.util.*;

class Main{
  static int n;
  public static void main(String args[])throws Exception{
    Scanner sc = new Scanner(System.in);
    int sum=0;
    n = sc.nextInt();
    int k = sc.nextInt();
    int list [] = new int[n];
    int max = 0;
    ArrayList<Integer> brock = new ArrayList<>();
    for(int i =0; i<n; i++){
      brock.add(sc.nextInt());
      sum+=brock.get(i);
      max = Math.max(max,brock.get(i));
    }
    int left = max;
    int right = sum;
    while (left < right) {
      int mid = (left + right) / 2;
      int count = 0;
      sum = 0;
      for (int i = 0; i < n; i++) {
        if (sum + brock.get(i) > mid) {
          sum = brock.get(i);
          count++;
        } else {
          sum += brock.get(i);
        }
        if (count == k) {
          break;
        }
      }
      if (count == k) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }
    System.out.println(left);
  }
}
//   Collections.sort(brock, Collections.reverseOrder());
//   for(int i = 0; i<n; i++){
//     list[getmin(list)] += brock.get(i);
//   }
//   System.out.println(maxlist(list));
// }
//
// static int getmin(int list[]){
//   int min = 99999;
//   int min_n=0;
//   for(int i = 0; i<n; i++){
//     if(list[i]<min){
//       min = list[i];
//       min_n = i;
//     }
//   }
//   return min_n;
// }
//
// static int maxlist(int list[]){
//   int max = 0;
//   for(int i = 0; i<n; i++){
//     if(list[i]>max){
//       max = list[i];
//     }
//   }
//   return max;
// }
