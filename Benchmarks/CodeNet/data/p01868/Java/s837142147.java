
import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new D().doIt();
    }
    class D{
    	void doIt(){
    		int n = sc.nextInt();
    		int num[] = new int [n];
    		int print[] = new int [3];
    		for(int i = 0;i < n;i++){
    			num[i] = sc.nextInt();
    		}
    		Arrays.sort(num);
    		for(int i = n -1;i >= 0;i--){
    			print[0] = print[0] + num[i];
    			Arrays.sort(print);
    		}
    		System.out.println(print[2]);
    	}
    }
}