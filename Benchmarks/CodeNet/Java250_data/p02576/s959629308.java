import java.util.Scanner;

class Main {
    
    public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int x = sc.nextInt();
    	int t = sc.nextInt();
      	sc.close();
    	
    	int total = n % x == 0 ? n / x : n / x + 1;
    	
    	System.out.println(total * t);
    	
    	
    	
    }

}