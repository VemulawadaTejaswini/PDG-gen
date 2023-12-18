import java.util.*;

class Main{
  public static int bottommost(int[] num1, int n){
    int[] num2 = new int[n-1];
    int ans;
    int numTemp = 0;
    for (int i = 0; i < n-1; i++) {
      numTemp = num1[i] + num1[i+1];
      if(numTemp >= 10) {
        numTemp -= 10;
      }
      num2[i] = numTemp;
    }
    if(n == 2) {
      ans = num2[0];
    }
    else {
      ans = bottommost(num2,n-1);
    }
    return ans;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      String str = sc.next();
      char[] charArr = str.toCharArray();
      int n = charArr.length;
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = charArr[i] - '0';
      }
      int ans = bottommost(arr,n);
      System.out.println(ans);
    }
  }
}