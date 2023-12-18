import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	int s = input.nextInt();
    	HashMap<Integer,Boolean> sa = new HashMap<Integer,Boolean>();
    	for(int i = 0 ; i < s ; i++){
    		sa.put(input.nextInt(), true);
    	}
    	int t = input.nextInt();
    	int count = 0;
    	for(int i = 0 ; i < t ; i++){
    		if(sa.containsKey(input.nextInt()))count++;
    	}
    	System.out.println(count);
    }
}