import java.util.*;
public class Main {
     static int getTheNumberOfCoin(int C[],int n,int m){
    	 int T[] = new int[n + 1];
    	 for(int i = 1;i < n + 1;i++){
    		 T[i] = T[i - 1] + C[0];
    	 }
    	 for(int i = 0;i < m;i++){
    		 for(int j = C[i];j < n + 1;j++){
    			 if(T[j] < T[j - C[i]] + 1){
    				 T[j] = T[j];
    			 }else{
    				 T[j] = T[j - C[i]] + 1;
    			 }
    		 }
    	 }
    	 return T[n];
     }
     public static void main(String[] args) {
    	 Scanner in = new Scanner(System.in);
    	 int n = in.nextInt();
    	 int m = in.nextInt();
    	 int C[] = new int [m]; 
    	 for(int i = 0;i < m;i++){
    		 C[i] = in.nextInt();
    	 }
    	 int min = getTheNumberOfCoin(C,n,m);
    	 System.out.println(min);
     }
}