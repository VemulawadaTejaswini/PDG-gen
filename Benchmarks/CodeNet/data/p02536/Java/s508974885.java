import java.util.Scanner;

class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      
		int city = sc.nextInt();
      	int load = sc.nextInt();
      
      	for(int i = 1; i <= load; i++) {
        	sc.nextInt();
          	sc.nextInt();
        }
      
      	System.out.println(city - 1 - load);
    }
}