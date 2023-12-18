import java.util.Scanner;
class Main{
    public static void main(String[] a){
    	
    	Scanner scan = new Scanner(System.in);
    	while (scan.hasNext()){ 
    	int n = 0;
    	n = scan.nextInt();
    	if(n  == 0){
    		break;
    	} 
    	int result = 0;
    	for(long i = 5; i <= n;i*=5){
    		result += n/i; 	
    	
    	}
    	System.out.println(result);

    }
 }
}