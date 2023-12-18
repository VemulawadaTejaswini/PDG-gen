import java.util.Scanner;

public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		int a;
		int count = 1;
	    for(;;){
	    	a = s.nextInt();
	    	if(a == 0) break;
	    	System.out.println("Case " +count + ":" + a);
	    	count++;
	    }
	    
	}
	public static void main(String[] args) {
		
		new Main().run();
		
	}
}