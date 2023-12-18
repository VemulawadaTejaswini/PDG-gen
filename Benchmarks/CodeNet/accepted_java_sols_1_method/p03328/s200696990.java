import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
        int b = sc.nextInt();
        int n = b - a;
        int x = 1;
        for(int i = 2; i <= n; i++){
        	x += i;
        }
        System.out.println(x - b);
    }
}