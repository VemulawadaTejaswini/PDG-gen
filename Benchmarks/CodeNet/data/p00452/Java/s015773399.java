import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        	while(true) {
        		int n = sc.nextInt();
        		int m = sc.nextInt();
        		if(n==0 && m==0) break;
        		Integer [] score = new Integer[n+1];
        		for(int i=0;i<n;i++) {
        			score [i] = sc.nextInt();
        		}
        		score[n] = 0;
        		Arrays.sort(score, Collections.reverseOrder());
        		
        		/*for(int j=n-1;j>0;j--) {
        			for(int i=0;i<j;i++) {
            			if(score[i]<score[i+1]) {
            				int temp = score[i];
            				score[i] = score[i+1];
            				score[i+1] = temp;
            			}
            		}
        		}*/
        		
        		int sum = 0;
        		int j=0;
        		for(int i=0;i<4;) {
        			int a = m-score[j];
        			if(a<0) {
        				j++;
        			}else {
        				sum += score[j];
        				m = a;
        				i++;
        			}
        		}
        			
        	    System.out.println(sum);
        		
        	}
        }
    }
}
   
