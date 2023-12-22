import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
      int[] m = new int[n];
      int sum = 1;
	    for(int i =0; i<n; i++) {
    	  m[i] = sc.nextInt();
    	    }
	    for(int i =1; i<n; i++) {
	    	 int c = 0;
	    	for(int j =0; j<i; j++) {
	    	 
	    	  if(m[i]>=m[j]) {c++;}
	    	   } 
	    	if(c==i) {sum++;}
	    	  
		    } 
	    	
	   
	


	    System.out.println(sum);
	}
	}