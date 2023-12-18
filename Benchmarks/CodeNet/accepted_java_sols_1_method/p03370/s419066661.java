import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
      int x = sc.nextInt();
      int[] m = new int[n];
      int min=1000;;
	  for(int i=0;i<n;i++){
        m[i]=sc.nextInt();
        x-=m[i];
        min = Math.min(min,m[i]);
      } 
         System.out.println(n+x/min);
    }
}