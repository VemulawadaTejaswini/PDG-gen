import java.util.Scanner;


public class Main{
    public  static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        	while(sc.hasNext()) {
        		int[] dp=new int[51];
        		int n = sc.nextInt();
        		for(int i=0; i<=9; i++) {
        			for(int j=0; j<=9; j++) {
        				for(int k=0; k<=9; k++) {
        					for(int s=0; s<=9; s++) {
        						dp[i+j+k+s]++;
        					}
        				}
        			}
        		}
        		System.out.println(dp[n]);
        	}
        }
    }
}
