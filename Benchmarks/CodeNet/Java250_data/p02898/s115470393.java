import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String[] humansAndHeight = sc.nextLine().split(" ");
    	int humans = Integer.parseInt(humansAndHeight[0]);
    	int height = Integer.parseInt(humansAndHeight[1]);
    	String[] heights = sc.nextLine().split(" ");
    	
    	int count =0;
    	for(int i = 0;i<humans;i++) {
    		int tmp = Integer.parseInt(heights[i]);
    		if(tmp >= height) {
    			count++;
    			
    		}
    	}
 
    	System.out.println(count);
    	
    	
    }
}