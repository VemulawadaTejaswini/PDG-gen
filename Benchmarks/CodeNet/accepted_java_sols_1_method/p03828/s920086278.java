import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] cnt = new int[1001];
      for(int i = 2;i <= n;i++){
        int s = i;
      	for(int j = 2;j <= i;j++){
        	while(s%j==0){
              s/=j;
              cnt[j]++;
            }
        }
      }
      long sum = 1;
      for(int i = 1;i <= 1000;i++)sum = (sum*(cnt[i]+1))%1000000007;
      System.out.println(sum);
    }
}