import java.util.*;
import java.io.FileNotFoundException;
import java.io.File;

public class Main {
	
    	static int n,q;
        static ArrayList<Integer> A = new ArrayList<Integer>(),
                                  M = new ArrayList<Integer>();
        static ArrayList<Boolean> R = new ArrayList<Boolean>();
        
    public static void main(String[] args) {
        
    	//Input
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
        	A.add(sc.nextInt());
        }
        q = sc.nextInt();
        for(int i = 0; i < q; i++){
        	M.add(sc.nextInt());
        }
        
        //Calculation
        for (int i = 0; i < q; i++){
        	R.add(solve(0,M.get(i)));
        }
        
        //Output
        print(R);
    }

    private static boolean solve(int p,int t){
    	if(p == n){
    		if(t == 0){
    			return true;
    		} else {
    			return false;
    		}
    	}
    	if (solve(p + 1,t - A.get(p)) || solve(p + 1,t)){
    		return true;
    	} else {
    		return false;
    	}
    }
    
    private static void print(ArrayList<Boolean> R){
    	for (Boolean b:R){
			if (b == true) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
    }
}