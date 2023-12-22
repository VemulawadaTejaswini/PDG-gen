import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = Integer.parseInt(sc.next());
		boolean flag = true;
		
		int lim = (int)Math.sqrt(2 * x);
		
		for(int i = 0; i < 2*x; ++i) {
		    for(int j = 2; j < lim; ++j) {
		        
		        if((x + i) % j != 0) {
		            flag = true;
		            continue;
		        }
		        else {
		            flag = false;
		            break;
		        }
		    }
		    
		    if(flag) {
		        System.out.println(x + i);
		        break;
		    }
		    else continue;
		}
    }
}