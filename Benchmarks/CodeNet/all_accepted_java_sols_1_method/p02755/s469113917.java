import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n8 = sc.nextInt();
        int n10 = sc.nextInt();
        for(int i = 1; i <= 1000; i++){
        	if((int)(i * 0.08) == n8 && (int)(i * 0.1) == n10){
            	System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
    }
} 