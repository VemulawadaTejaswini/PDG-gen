import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();
      	int ds[] = new int[n+1];
      	int stack;
      	int count = 1;

      	for(int i = 0;i < n;i++) ds[i] = sc.nextInt();
      	ds[n] = 101;
      	Arrays.sort(ds);
      	stack = ds[0];
      	for(int i = 1;i < n;i++){
          if(stack != ds[i]){
            count++;
            stack = ds[i];
          }
        }
      
      	System.out.println(count);
	}
}