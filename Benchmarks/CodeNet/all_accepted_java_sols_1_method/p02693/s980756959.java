import java.util.HashSet;
import java.util.Scanner;

public class Main {
	

    public static void main(String[] args) {
		
    	Scanner s = new Scanner(System.in);
    	int k = s.nextInt();
    	int a = s.nextInt();
    	int b = s.nextInt();
    	
    	int flag=0;
    	for(int i=a;i<=b;i++) {
    		if(i%k==0) {
    			System.out.println("OK");
    			flag=1;
    			break;
    		}
    	}
    	if(flag==0) {
    		System.out.println("NG");
    	}
	}
}