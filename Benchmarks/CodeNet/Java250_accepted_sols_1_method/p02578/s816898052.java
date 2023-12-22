import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	
      	long[] arr = new long[n];

      	for(int i = 0; i<n; i++){
          arr[i] = sc.nextInt();
        }
		long pre = 0;
      	long now = 0;
      	long sum = 0;
      	for(int i = 0; i<n; i++){
          if (i == 0){
            continue;
          }
          now = arr[i];
          pre = arr[i-1];
          if(now > pre){
            continue;
          }
          long step = pre - now;
          sum += step;
          arr[i] = pre;
        }
      System.out.println(sum);
    }
}