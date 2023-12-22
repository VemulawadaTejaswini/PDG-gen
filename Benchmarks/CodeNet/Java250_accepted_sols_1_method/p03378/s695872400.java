import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int mas = in.nextInt();
      	int cost = in.nextInt();
      	int start = in.nextInt();
      	int sum1 = 0;
        int sum2 = 0;
      
      for(int i = 0;i < cost;i++){
        int kane = in.nextInt();
        if(kane<start){
          sum1++;
        }else{
          sum2++;
        }
      }
      System.out.print(Math.min(sum1,sum2));
	}
}