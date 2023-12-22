import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int orders[] = new int[5];
      	int diff;
      	int final_diff = 0;
      	int answer = 0;
      
      	for(int i = 0; i < 5; i++){
          orders[i] = sc.nextInt();
          diff = 10 - orders[i] % 10;
          if(diff == 10) diff = 0;
          if(final_diff < diff) final_diff = diff;
          orders[i] += diff;
        }
      
      	for(int order:orders){
          answer += order;
        }
      
      	answer -= final_diff;
 		
      	System.out.println(answer);
        
	}
}