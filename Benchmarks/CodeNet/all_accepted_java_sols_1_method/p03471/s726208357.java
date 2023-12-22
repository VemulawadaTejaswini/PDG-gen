import java.util.*;

class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int y = sc.nextInt();
    int z = 0;
    boolean flag = false;
    outside: for(int i = 0; i <= n; i++) {
    	for(int j = 0; j <= n - i; j++) {
    		z = n - i - j;
    		if(10000 * i + 5000 * j + 1000 * z == y && y >= 10000 * i + 5000 * j) {
    			flag = true;
    			System.out.println(i + " " + j + " " + z);
    			break outside;
    		}
    	}
    }
    if(flag == false) {
    	System.out.println("-1 -1 -1");
    }
}
}
