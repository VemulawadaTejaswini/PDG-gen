// AOJ 1626
import java.util.Scanner;
 
public class Main{
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
        	int n = sc.nextInt();
        	if(n == 0) break;
        	int i = 1;
        	int j = 0;
        	int sum = 0;
        	while(true) {
            	while(sum < n) {
            		j++;
            		sum += j;
            	}
            	if(sum == n) {
            		System.out.println(i + " " + (j - i + 1));
            		break;
            	}else {
            		while(sum > n) {
            			sum -= i;
            			i++;
            		}
            	}
        	}
        }
    }
}
