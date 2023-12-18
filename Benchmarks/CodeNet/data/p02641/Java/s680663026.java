
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] str1 = sc.nextLine().split(" ");
    String[] str2 = sc.nextLine().split(" ");
    int x = Integer.parseInt(str1[0]);
    int n = Integer.parseInt(str1[1]);
    int index = x;

    int[] num = new int[102];

    for(int i = 0 ; i < 102;i++) {
      num[i] = i;
    }
    

    for(int i = 0;i < n;i++) {
      num[Integer.parseInt(str2[i])] = -1;
    }
    int minIndex = -1;
    int maxIndex = -1;

    for(int i = 0 ; i < 102;i++) {
      if(i < index) {
        if(num[i] != -1) {
          minIndex = i;
        }
      }else {
        if(num[i] != -1) {
          maxIndex = i;
          break;
        }
      }
    }

    int ans = 0;
    if(minIndex != -1 && maxIndex != -1) {
      if(x - num[minIndex] <= num[maxIndex] - x) {
        ans = num[minIndex];
      }else {
        ans = num[maxIndex];
      }
    }else if(minIndex != -1 && maxIndex == -1) {
      ans = num[minIndex];
    }else {
      ans = num[maxIndex];
    }

    System.out.println(ans);

  }

}
