import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    		while(true){

    		
    				int n = sc.nextInt();
    				if (n == 0) { break; }
    				
    				int[] scores = new int[n];
    				for ( int i=0;i<scores.length;i++){
    					scores[i] = sc.nextInt();
    				}
    		
    		double average = 0,variance = 0;
    		int j=0;
    		int k = 0;
    		while(j<=n-1){
    			average = average + scores[j];
    			j++;
    		}
    		average=average/n;
    		
    		double temp = 0;
    		double temp1=0;
    		double sum = 0;
    		while(k <=n-1){
    			temp = scores[k]-average;
    			temp1 = temp*temp;
    			sum = sum + temp1;
    			k++;
    		}

    		variance = sum/n;

    		System.out.println(Math.sqrt(variance));

}
 
}
}