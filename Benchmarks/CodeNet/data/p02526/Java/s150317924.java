import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	int s = input.nextInt();
    	ArrayList<Integer> sa = new ArrayList<Integer>();
    	for(int i = 0 ; i < s ; i++){
    		sa.add(input.nextInt());
    	}
    	int t = input.nextInt();
    	int count = 0;
    	for(int i = 0 ; i < t ; i++){
    		if(sa.contains(input.nextInt()))count++;
    	}
    	System.out.println(count);
    }
}