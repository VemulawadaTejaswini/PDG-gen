import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        int count = 0;
        int x = 1;
        for(int i = 0; i < n; i++){
        	num[i] = sc.nextInt();
            if(num[i] != x){
            	count++;
            }else{
            	x++;
            }
        }
        if(x == 1){
        	System.out.println("-1");
        }else{
        	System.out.println(count);
        }
    }
}