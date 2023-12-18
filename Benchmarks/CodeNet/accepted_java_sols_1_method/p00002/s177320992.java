import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	int a = 0,b = 0,k;
    	Scanner in = new Scanner(System.in);
    	while(true){
    		int cnt = 0;
    		try{
    			a = in.nextInt();
    			b = in.nextInt();
    			k = a + b;
    		}
    		catch (Exception e){
    			System.exit(0);
    		}
    		k = a + b;
    		while(k > 0){
    			k = k / 10;
    			cnt = cnt + 1;
    		}
    		System.out.println(cnt);
    	}
    }
}