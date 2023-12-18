import java.util.Scanner;

public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		int x;
		int count = 1;
	    for(;;){
	    	x = s.nextInt();
	    	if(x == 0) break;
	    	System.out.println("Case " +count + ":" + x);
	    	count++;
	    }
	    
	}
	public static void main(String[] args) {
		
		new Main().run();
		
	}
}