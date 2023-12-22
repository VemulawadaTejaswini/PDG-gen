import java.util.*;

class Main{
	public static void main(String[] args){
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sum = 0;
      int[] value = new int[n];
      int[] cost = new int[n];
      for(int j = 0;j<n;j++){
        value[j] = scn.nextInt();
      }
      for(int k = 0;k<n;k++){
        cost[k] = scn.nextInt();
      }
      for(int i = 0; i<n;i++){
        if(value[i]-cost[i]>0){
          sum += value[i]-cost[i];
        }
      }
      System.out.println(sum);
	}
}