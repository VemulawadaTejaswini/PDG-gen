import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
     	int n = sc.nextInt();
      	long[] a = new long[n];
     	long[] ans = new long[n];
      	long max = 0;
      	for(int i=0;i<n;i++){
          a[i] = sc.nextLong();
          if( a[i] <= max ){
            ans[i] = max - a[i];
          }else{
            max = a[i];
          }
        }
      	long answer = 0;
      	for(int i=0;i<n;i++){
          answer += ans[i];
        }
      	System.out.println(answer);
	}
}