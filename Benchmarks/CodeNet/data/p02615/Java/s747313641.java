import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
      	long a[] = new long[n];
        int i;
        long count = 0;
      	for(i = 0;i < n;i++){
          a[i] = sc.nextInt();
        }
      Arrays.sort(a); 
      	for(i = 1;i < n;i++){
			count += a[i];
        }
      	System.out.println(count); 
    }
}