import java.util.Scanner;
class Main{
    public static void main(String[] a){
    	
    	Scanner scan = new Scanner(System.in);
    	while (scan.hasNext()){ 
    	long n = 0;
    	long result = 0;
    	n = scan.nextInt();
    	
    	for(int i = 5; i < n;i*=5){
    		result += n/i; 
    	}
    	System.out.println(result);
    }
 }
}