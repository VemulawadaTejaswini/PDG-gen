import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		long t = sc.nextLong();
        long time[] = new long[n];
        int i;
        long count = 0;
		for(i = 0;i < n; i++){
          time[i] = sc.nextLong();
	    }
        for(i = 1;i < n; i++){
          if(time[i] - time[i - 1] <= t){
            count += time[i] - time[i - 1];
          }else{
            count += t;
          }
          
        }
        count += t;
        System.out.println(count); 
  
    }
}