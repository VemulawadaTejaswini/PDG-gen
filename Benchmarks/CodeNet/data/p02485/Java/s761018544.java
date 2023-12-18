import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	while(true){
    		String n = input.next();
    		if(n.equals("0"))break;
    		int sum = 0;
    		for(int i = 0 ; i < n.length(); i++){
    			sum += (n.charAt(i)-48);
    		}
    		System.out.println(sum);
    	}
    }
}