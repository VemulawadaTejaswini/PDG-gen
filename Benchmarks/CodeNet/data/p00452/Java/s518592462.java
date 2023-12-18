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
        		int [] sum = new int [(n+1)*(n+1)*(n+1)*(n+1)];
        		for(int i=0;i<n+1;i++) {
        			for(int j=0;j<n+1;j++) {
        				for(int k=0;k<n+1;k++) {
        					for(int l=0;l<n+1;l++) {
        	        			sum[(n+1)*(n+1)*(n+1)*i+(n+1)*(n+1)*j+(n+1)*k+l] = score[i]+score[j]+score[k]+score[l];
        	        		}
                		}
            		}
        		}
        		Arrays.sort(sum);
        		search:
        			for(int i=m;i>0;i--) {
        				int low = 0;
        				int high = sum.length;
        				while(low<high) {
        					int mid = (low+high)/2;
        					if(sum[mid]==i) {
        						System.out.println(sum[mid]);
        						break search;
        					}else if(sum[mid]>i) {
        						high = mid;
        					}else if(sum[mid]<i) {
        						low = mid+1;
        					}
        				}	
        			}
        	}
        }
    }
}
    
