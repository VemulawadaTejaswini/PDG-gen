import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[]a = new int[n];
   
    for(int i=0; i<n; i++) {
    	a[i] = sc.nextInt();
    	    }
    Arrays.sort(a);
    int cou = 0;
    for(int i=0; i<n-1; i++) {
    	if(a[i] == a[i+1]) {
    		cou++;
    	}
    }
    if(cou == 0) {
    	System.out.println("YES ");
    }else {
    	System.out.println("NO ");
    }  
      }
}
