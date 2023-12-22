import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int count = Integer.parseInt(sc.nextLine());
    	double oddCount = 0;
    	for(int i = 1;i<=count;i++) {
    		if(i%2 == 1) {
    			oddCount++;
    		}
    	}
 
    	System.out.println(oddCount/count);
    	
    	
    }
}