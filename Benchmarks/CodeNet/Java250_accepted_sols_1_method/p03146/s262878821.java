import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
	        int s = sc.nextInt();
	        int x = 0;
	        
        	List<Integer> list = new ArrayList<>();
	        
	        for(int i=2; i<1000000; i++) {
	         	list.add(s);
	        	if(s%2==0) {
	        		x = s/2;
	        	}else {
	        		x = 3*s+1;
	        	}
	        	s = x;
	        	if(list.contains(x)) {
	        		System.out.println(i);
	                break;
	            }
	        }
	}

}
