import java.util.Scanner;

public class Main {
        public static void main(String args[]){
        	Scanner scn = new Scanner(System.in);
        	int n=scn.nextInt();
        	 long [] arr =new long[n];
        	 long xor = 0;
        	 for(int i=0;i<n;i++){
        		 arr[i]=scn.nextLong();
        		 xor^=arr[i];
        	 }
        	StringBuilder sb =new StringBuilder();
        	for(int i=0;i<n;i++){
        		long val = xor^arr[i];
        		sb.append(val+" ");
        	}
        	System.out.println(sb);
        }
}