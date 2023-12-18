import java.util.Scanner;
class Main {
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int num1 = scan.nextInt();
    	int num2 = scan.nextInt();
    	int x;
    	int y;
    	
    	if(num1 > num2){
    		x = num1;
    		y = num2;
    	}else{
    		x = num2;
    		y = num1;
    	}
    	
    	int tmp;
    	for( ;(tmp = x % y) != 0; ){
    		x = y;
    		y = tmp;
    	}
    	
    	System.out.println(y);
     }
}