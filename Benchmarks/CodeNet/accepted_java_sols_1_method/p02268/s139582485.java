import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        	int n = sc.nextInt();
        	int [] S = new int[n];
        	for(int i=0;i<n;i++) {
        		S[i] = sc.nextInt();
        	}
        	
        	int q = sc.nextInt();
        	int [] T = new int[q];
        	for(int i=0;i<q;i++) {
        		T[i] = sc.nextInt();
        	}
        	int C = 0;
        	for(int i=0;i<q;i++) {
        		int low = 0;
            	int high = n;
        		loop:while(low<high) {
        			int mid = (low+high)/2;
        			if(S[mid]==T[i]) {
        				C++;
        				break loop;
        			}
        			else if(S[mid]>T[i]) high=mid;
        			else if(S[mid]<T[i]) low=mid+1;
        		}
        	}
        	System.out.println(C);
        }
    }
}
