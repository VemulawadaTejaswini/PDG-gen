import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
        int X = sc.nextInt();
        
        int sum = 500*K;
        
        if(X <= sum){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
	}
}