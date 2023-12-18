import java.util.Scanner;
 
 
public class Main{
     
	public static int max(int[] array, int s, boolean flag){
		if(s < 0){
			return 0;
		}else if(s <= 1){
			return array[s];
		}else{
			if(array[s-1] > (flag ? 1 : 0)){
				return array[s] + max(array, s - 2, false);
			}else{
				int n = max(array, s - 2, true);
				int m = max(array, s - 3, false);
				
				if(m == 0){
					return array[s];
				}else{
					return array[s] + n - 1;
				}
			}
		}
	}
	
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	
    	final int N = sc.nextInt();
    	
    	for(int i = 0; i < N; i++){
    		final int L = sc.nextInt();
    		
    		int[] array = new int[L];
    		
    		for(int j = 0; j < L; j++){
    			array[j] = sc.nextInt();
    		}
    		
    		System.out.println(max(array, L-1, false));
    		
    	}
    	
    }
     
}