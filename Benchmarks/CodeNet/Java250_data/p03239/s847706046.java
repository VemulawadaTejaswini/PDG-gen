import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tl = sc.nextInt();
        int cost[] = new int[n];
        int min = 1001;
        for(int i = 0; i < n; i++){
        	cost[i] = sc.nextInt();
            if(sc.nextInt() <= tl && cost[i] < min){
            	min = cost[i];
            }
        }
        if(min == 1001){
        	System.out.println("TLE");
        }else{
        	System.out.println(min);
        }
    }
}