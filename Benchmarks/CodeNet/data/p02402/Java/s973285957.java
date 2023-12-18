import java.util.Scanner;

class Main{
      public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	
    	int n = scan.nextInt();
    	int a[] = null;
    	int max = 0;
    	int sum = 0;
    	for(int i = 0; i < n; i++){
    	    a[i] = scan.nextInt();
    	}
    	
    	int min = a[0];
    	
    	for(int i = 0; i < n; i++){
    	    min = Math.min(min, a[i]);
    	    max = Math.max(max, a[i]);
    	    sum += a[i];
    	}
    	
    	System.out.println(min + " " + max + " " + sum);
     }
}