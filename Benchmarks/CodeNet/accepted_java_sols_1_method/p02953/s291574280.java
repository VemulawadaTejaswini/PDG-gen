import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] h = new int[n];
      for(int i = 0;i < n;i++){
      	h[i] = sc.nextInt();
      }
      boolean a = true;
      for(int i = n-2;i >= 0;i--){
      	if(h[i] > h[i+1])h[i]--;
      }
      for(int i = 0;i < n-1;i++){
      	if(h[i] <= h[i+1]) a &= true;
        else a = false;
      }
      if(a)System.out.println("Yes");
      else System.out.println("No");
    }
}
