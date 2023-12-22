import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
        HashSet hs = new HashSet();
        for(int i = 0; i < n; i++){
        	hs.add(sc.next());
        }
        if(n == hs.size()){
        	System.out.println("YES");
        }else{
        	System.out.println("NO");
        }
    }
}