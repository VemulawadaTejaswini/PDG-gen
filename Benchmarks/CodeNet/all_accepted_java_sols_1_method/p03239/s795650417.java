import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int cost[] = new int[N];
        int time[] = new int[N];
        int i;
        int result = 0;
        for(i = 0;i < N; i++){
          cost[i] = sc.nextInt();
          time[i] = sc.nextInt();
          if(time[i] <= T){
            if(result > cost[i] || result == 0){
                result = cost[i];
            }
          }
        }
      	if(result == 0){
           System.out.println("TLE");   
        }else{
     	   System.out.println(result);   
        }
    }
}