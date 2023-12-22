import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] l = new int[m];
      int[] r = new int[m];
      int max = 0;
      int min = 1000000;
      int count = 0;
      for(int i = 0;i < m;i++){
      	l[i] = sc.nextInt();
        max = Math.max(max,l[i]);
        r[i] = sc.nextInt();
        min = Math.min(min,r[i]);
      }
      for(int i = 1;i <= n;i++){
      	if(max <= i && i <= min){
          count++;
        }
      }
      System.out.println(count);
    }
}
