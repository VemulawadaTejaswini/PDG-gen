import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	while(input.hasNext()){
    		double a = input.nextDouble();
    		System.out.println(doub(a));
    	}
    }
    
    public static double doub(double a){
    	double sum = a;
    	double nownum = a;
    	for(int i = 2 ; i <= 10 ; i++){
    		if(i % 2 == 0){
    			nownum *= 2;
    			sum += nownum;
    		}else{
    			nownum /= 3;
    			sum += nownum;
    		}
    	}
    	return sum;
    }
}