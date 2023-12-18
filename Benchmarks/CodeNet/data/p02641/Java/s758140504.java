import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
      	int x = scn.nextInt();
      	int n = scn.nextInt();
      	if(n == 0){
          System.out.println(x);
          return;
        }
      	
      	Integer[] nums = new Integer[n];
      	for(int i = 0; i < n; i++){
          nums[i] = scn.nextInt();
        }
      
      	int num = x;      	
      	for(int i = 0; i < 51;i++){
	      	if(!Arrays.asList(nums).contains(x-i)){
              System.out.println(x - i);
              return;
    	    }
          	if(!Arrays.asList(nums).contains(x+i)){
              System.out.println(x + i);
              return;
            }
        }
	}
}

