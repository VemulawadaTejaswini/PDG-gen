import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      String s = sc.next();
      List<Integer> arr = new ArrayList<>();
      for(int i = 0; i < s.length(); i++) {
        int flag = 1;
        if(s.charAt(i) == 'L')
          flag = -1;
        int cnt = 1;
        while(i < s.length() - 1 && s.charAt(i) == s.charAt(i+1)) {
          cnt++;
          i++;
        }
        arr.add(cnt * flag);
      }

      int[] leftSum = new int[arr.size()];
      for(int i = 1; i < arr.size(); i++)
        leftSum[i] = leftSum[i-1] + Math.abs(arr.get(i-1)) - 1;
        
      int[] rightSum = new int[arr.size()];
      for(int i = rightSum.length - 2; i >= 0; i--)
        rightSum[i] = rightSum[i+1] + Math.abs(arr.get(i+1)) - 1;

      int maxSum = 0;
      int replaceCnt = 0;
      int sum = 0;
      for(int i = 0, leftIdx = 0; i < arr.size(); i++) {
        int num = arr.get(i);
        if(num < 0) replaceCnt++;
        sum += Math.abs(num);
        while(replaceCnt > k) {
          int leftNum = arr.get(leftIdx++);
          if(leftNum < 0) replaceCnt--;
          sum -= Math.abs(leftNum);
        }
        
        maxSum = Math.max(maxSum, sum + leftSum[leftIdx] + rightSum[i] - 1);
      }

      replaceCnt = 0;
      sum = 0;
      for(int i = 0, leftIdx = 0; i < arr.size(); i++) {
        int num = arr.get(i);
        if(num > 0) replaceCnt++;
        sum += Math.abs(num);
        while(replaceCnt > k) {
          int leftNum = arr.get(leftIdx++);
          if(leftNum > 0) replaceCnt--;
          sum -= Math.abs(leftNum);
        }
        
        maxSum = Math.max(maxSum, sum + leftSum[leftIdx] + rightSum[i] - 1);
      }
      
      System.out.println(maxSum);
  }
}