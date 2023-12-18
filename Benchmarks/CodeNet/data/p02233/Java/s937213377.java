import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        
        ArrayList<Integer> fib = new ArrayList<Integer>();
        
        fib.add(1);
        fib.add(1);
        
        for(int i=2;i<number;i++){
        	fib.add(fib.get(i-1)+fib.get(i-2));        	
        }
        
        System.out.println(fib.get(number-1));
    }
}