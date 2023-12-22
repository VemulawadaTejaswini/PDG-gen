import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int[] cnt = new int[4];
      for(int i = 0;i < 6;i++){
        int a = sc.nextInt();
        cnt[a-1]++;
      }
      if(cnt[0]==0||cnt[0]==3||cnt[1]==0||cnt[1]==3||cnt[2]==0||cnt[2]==3||cnt[3]==0||cnt[3]==3)System.out.println("NO");
      else System.out.println("YES");
    }
}