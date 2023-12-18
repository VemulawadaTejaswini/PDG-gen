import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> list;
    ArrayList<Integer> list2;

    list = new ArrayList<>();
    list2 = new ArrayList<>();
    int pre = 1;
    int n = 1;
    while((pre = n*(n+1)*(n+2)/6)<1000000) {
      n++;
      if(pre%2==1) list.add(pre);
      list2.add(pre);
    }
    int input = 0;

    int[] dp2 = new int[1000001];
    int[] dp = new int[1000001];
    while((input=scan.nextInt())!=0) {
      System.out.print(calc(input,dp2,list2)+" ");
      System.out.println(calc(input,dp,list));
    }
  }

  static int calc(int sum, int[] dp, ArrayList<Integer> list) {
    if(sum==0) return 0;
    if(dp[sum]>0) return dp[sum];
    int max = 0;
    int count = 999999;
    int res = 0;
    for(int i = list.size()-1; i >= 0; i--) {
      max = list.get(i);
      if(max==sum) {
        res = 1;
        break;
      }
      if(max<sum) {
        res = 1 + calc(sum-max,dp,list);
        count = Math.min(res, count);
      }
    }
    count = Math.min(res, count);
    dp[sum] = count;
    return count;
  }
}