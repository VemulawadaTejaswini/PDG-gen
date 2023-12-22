import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	    	
    	int all = 1;
    	while(all<=N) {
    			all *= 2;
    	   	}
    	if(all>N) {
    	System.out.println(all/2);
    	}else {
    	System.out.println(all);
    }
    }
}
