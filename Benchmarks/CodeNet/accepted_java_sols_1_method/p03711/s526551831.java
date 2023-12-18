import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

  		int nums[] = new int[2]; 
      	int g[][] = {{1,3,5,7,8,10,12},{4,6,9,11},{2}};
      
      	int x_group = 3;
      	boolean x_found;
      	boolean eg = false;
      	
      	for(int i = 0;i < 2; i++){
        	nums[i] = sc.nextInt();
        }
      
      	for(int i = 0; i < 3 && x_group == 3; i++){
          for(int j = 0;j < g[i].length && x_group == 3;j++){
            if(nums[0] == g[i][j]) x_group = i;
          }
        }
      
      	for(int i = 0; i < g[x_group].length;i++){
          if(g[x_group][i] == nums[1]) eg = true;
        }      	
 		
      	if(eg) System.out.println("Yes");
      	else System.out.println("No");
        
	}
}
