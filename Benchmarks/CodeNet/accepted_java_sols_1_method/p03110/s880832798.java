import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
   	
        int N = sc.nextInt();
        double sum = 0;
        
        for(int i=0;i<N;i++) {
        	
        	double num = sc.nextDouble();
        	String type = sc.next();
        	
        	if(type.equals("JPY")) {
        		sum +=num;
        	}
        	else {
        		sum += 380000.0 * num;
        	}
        }
        System.out.println(sum);
  	}
}