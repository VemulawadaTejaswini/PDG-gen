import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        int t = scan.nextInt();
        
        int arr[] = new int[t+1];
        
        for(int i = 1; i <= t; i++) {
            int data = scan.nextInt();
            arr[i] = data;
        }
        
        scan.close();
        
        for(int i = 1; i <= t; i++) {
        	
        	int temp = i;
        	
        	int parent = temp/2;
        	int left = 2*temp;
        	int right = 2*temp+1;
        	
        	System.out.print("node " + i + ":");
        	System.out.print(" key = " + arr[i] + ", ");
        	
        	if(parent <= t && parent > 0) {
        		
        		System.out.print("parent key = " + arr[parent] + ", ");
        		
        	}
        	
        	if(left <= t && left > 0) {
        		
        		System.out.print("left key = " + arr[left] + ", ");
        		
        	}
        	
        	if(right <= t && right > 0) {
        		
        		System.out.print("right key = " + arr[right] + ", ");
        		
        	}
        	
        	System.out.println();
        	
        }
        
    }	
}


