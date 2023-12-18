import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        	while(true) {
        		int n = sc.nextInt();
        		int m = sc.nextInt();
        		if(n==0 && m==0) break;
        		int [] score = new int[n+1];
        		for(int i=0;i<n;i++) {
        			score [i] = sc.nextInt();
        		}
        		score[n] = 0;
        		Arrays.sort(score);
        	   
        		int max = 0;
        		for(int a:score) {
        			for(int b:score) {
        				for(int c:score) {
        					for(int d:score) {
        						if(a+b+c+d>max && a+b+c+d<=m) {
        							max = a+b+c+d;
        						}
        					}
        				}
        			}
        		}
        		System.out.println(max);
        	}
        }
    }
}
 
