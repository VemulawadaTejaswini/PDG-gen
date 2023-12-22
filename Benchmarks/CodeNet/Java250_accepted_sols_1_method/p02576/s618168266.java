import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      
      	int total = sc.nextInt();
      	int once = sc.nextInt();
      	int time = sc.nextInt();
      	int count = 0;
      
		while(total > 0) {
        	total -= once;
      		count++;    	
        }
      	System.out.println(count * time);
    
    
    }
}