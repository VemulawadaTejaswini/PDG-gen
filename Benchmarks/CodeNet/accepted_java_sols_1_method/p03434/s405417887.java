import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int ans=0;
    int n=sc.nextInt();
    int[] nums=new int[n];
    for(int i=0;i<n;i++){
      nums[i]=sc.nextInt();
    }
    Arrays.sort(nums);
    for(int i=0;i<n;i++){
      ans+=nums[n-1-i]*(i%2==0?1:-1);
    }
    System.out.println(ans);
  }
}