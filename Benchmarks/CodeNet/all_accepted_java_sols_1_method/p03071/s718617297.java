import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int[] a = new int[2];
      	a[0] = sc.nextInt();
      	a[1] = sc.nextInt();
      	int sum = 0;
      
      	Arrays.sort(a);
      	sum += a[1];
      	a[1]--;
      	Arrays.sort(a);
      	sum += a[1];
      	a[1]--;
      	System.out.println(sum);
    }
}