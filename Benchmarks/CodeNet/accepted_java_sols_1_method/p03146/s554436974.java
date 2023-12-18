import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int S = sc.nextInt();
    	List<Integer> list = new ArrayList<>();
    	list.add(S);
    	while (true) {
        	if (S%2 == 0) {
        		S /= 2;
        		if (list.contains(S)) {
        			break;
        		} else {
        			list.add(S);
        		}
        	} else {
        		S = 3*S+1;
        		if (list.contains(S)) {
        			break;
        		} else {
        			list.add(S);
        		}
        	}
    	}
    	System.out.println(list.size()+1);
    }
}