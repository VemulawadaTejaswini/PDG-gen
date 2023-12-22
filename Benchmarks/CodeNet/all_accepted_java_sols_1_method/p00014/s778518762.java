
import java.util.Scanner;
class Main{
    public static void main(String[] a){
    	int d = 0;
    	
    	Scanner scan = new Scanner(System.in);
    	while (scan.hasNext()){
    	d = scan.nextInt();
    	int sum = 0;
    	for(int i = d;i < 600;i +=d){
    		sum += d*i*i;
    	}
    	System.out.println(sum);
    	}
    }
 }