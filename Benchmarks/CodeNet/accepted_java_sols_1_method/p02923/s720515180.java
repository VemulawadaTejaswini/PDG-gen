import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 		int num = sc.nextInt();
      	
      	int height[] = new int[num];
      	int kouho[] = new int[num];
      	int maximum = 0;
      	int maximum_kouho = 0;
      	height[0]=sc.nextInt();
      	for(int i=1;i<num;i++){
        	height[i] = sc.nextInt();
          	if(height[i]<=height[i-1]){ 
              maximum_kouho=maximum_kouho+1;
            }else{
              if(maximum_kouho>maximum){
              	maximum = maximum_kouho;
              }
                maximum_kouho = 0;
            }
        }
      	              if(maximum_kouho>maximum){
              	maximum = maximum_kouho;
              }
		
      	
		System.out.println(maximum);
	}
}