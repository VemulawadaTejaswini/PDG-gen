import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int ans = 0;
      int[] count = new int[31];
      for(int i = 0;i < n;i++){
      	int num = sc.nextInt();
        for(int j = 0;j < num;j++){
        	count[sc.nextInt()]++;
        }
      }
      for(int i:count){
      	if(i==n)ans++;
      }
      System.out.println(ans);
      
    }
}
