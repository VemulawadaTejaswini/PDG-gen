import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x;
        int i, sum;
        
        while(true) {
        	sum = 0;
        	x = sc.next();
        	if(x.equals("0")) break;
        	
        	for(i = 0; i < x.length(); i++) {
        		sum += x.charAt(i) - '0';
        	}
        	
        	System.out.println(sum);
        	
        }
    }
}
