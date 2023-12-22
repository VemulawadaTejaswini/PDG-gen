import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[]h = new int[n];
        
    int high = 0;
    int cou = 0;
    for(int i=0; i<n; i++) {
    	h[i] = sc.nextInt();
    	if(h[i] >= high) {
    		high = h[i];
    		cou++;
    }
    }     	
    	System.out.println(cou);
    }
}


