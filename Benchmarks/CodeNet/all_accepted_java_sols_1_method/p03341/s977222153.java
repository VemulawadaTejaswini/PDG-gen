import java.util.*;
 
public class Main {
  public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        int N = sc.nextInt();
        String S = sc.next();
        
        int def = 0;
        int cost = 0;
        int min_cost = 0;
        
        for(int i=0; i<N; i++){
            String str = String.valueOf(S.charAt(i));
 
            if(str.equals("W")) {
            	cost++;
            }
            
            if(str.equals("E")){
                cost--;
                def++;
            }
 
            if(cost < min_cost) {
            	min_cost = cost;
            }
 
        }
 
        System.out.println(def + min_cost);
        
	}
 
}
