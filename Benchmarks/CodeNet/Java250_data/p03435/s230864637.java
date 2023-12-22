import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int ans=0;
    int[][]nums=new int[3][3];
    for(int i=0;i<9;i++){
      nums[i/3][i%3]=sc.nextInt();
    }
    System.out.println(nums[1][0]-nums[0][0]==nums[1][1]-nums[0][1]&&nums[1][1]-nums[0][1]==nums[1][2]-nums[0][2]&&nums[2][0]-nums[1][0]==nums[2][1]-nums[1][1]&&nums[2][1]-nums[1][1]==nums[2][2]-nums[1][2]?"Yes":"No");
  }
}