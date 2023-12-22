import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
        int nums[] = new int[3];
      	boolean irj = true;
      
      	for(int i = 0;i < 3;i++) nums[i] = sc.nextInt();
        Arrays.sort(nums); 
      
      	if(nums[0] != 5) irj = false;
      	if(nums[1] != 5) irj = false;
      	if(nums[2] != 7) irj = false; 
          
        if(irj) System.out.print("YES");
        else System.out.println("NO");
      
	}
}