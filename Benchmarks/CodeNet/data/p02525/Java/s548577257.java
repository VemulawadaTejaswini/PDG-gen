import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    		
    				int n = sc.nextInt();
    				
    				int[] score = new int[n];
    				for ( int i=0;i<score.length;i++){
    					score[i] = sc.nextInt();
    				}
    		
    		double average = 0,variance = 0;
    		int j=0;
    		int k = 0;
    		while(j<=n){
    			average = average + score[j];
    			j++;
    		}

    		double temp = 0;
    		double temp1=0;
    		double sum = 0;
    		while(k <=n){
    			temp = score[k]-average;
    			temp1 = temp*temp;
    			sum = sum + temp;
    			k++;
    		}

    		variance = sum/n;

    		System.out.println(Math.sqrt(variance));

}
 
}