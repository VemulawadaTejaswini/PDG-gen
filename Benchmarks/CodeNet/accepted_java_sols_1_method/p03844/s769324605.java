import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String op = sc.next();
        int b = sc.nextInt();
        
        int sum = 0;
        
        if(op.equals("+")){
            sum =  a + b;
        }else if(op.equals("-")){
            sum = a - b;
        }
        
        
        System.out.println(sum);
	}
}