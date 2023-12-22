import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] nums=new int[3],rep=new int[2];
    rep[0]=0;
    rep[1]=0;
    for(int i=0;i<3;i++){
      nums[i]=sc.nextInt();
      if(nums[i]==5){
        rep[0]++;
      }else if(nums[i]==7){
        rep[1]++;
      }
    }
    if(rep[0]==2&&rep[1]==1){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}