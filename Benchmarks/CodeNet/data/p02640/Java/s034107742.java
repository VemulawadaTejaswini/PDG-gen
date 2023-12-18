import java.util.*;
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}
 
 
	public void run() {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
        
        int F=0;
        int T=0;
        
        F=X*4;
        T=X*2;
        
        if(T<=Y && F>=Y){
            if(Y%2==0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }else{
            System.out.println("No");
        }
		
		
		
	}
		
}
