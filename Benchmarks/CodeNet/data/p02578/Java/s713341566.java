import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	int[] arr = new int[N];
      	int res = 0;
      	for (int i = 0; i < N; i++){
        	arr[i] = sc.nextInt();
          	if ((i > 0) && (arr[i] < arr[i-1])){
            	int x = arr[i-1] - arr[i];
              	arr[i] += x;
            	res += x;
            }
        }
      	System.out.println(res);
    }
}