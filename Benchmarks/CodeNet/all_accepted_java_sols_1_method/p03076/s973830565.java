import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    
        int amtTime = 0;
        int maxLoss = 10;
        int maxLossNum = 0;
      	boolean a = true;
        
         List<Integer> Array = new ArrayList<>();
        
        while(sc.hasNextInt()) {
        	Array.add((Integer)sc.nextInt());
        }
        
        for(int i = 0; i < Array.size(); i++ ){
            if(Array.get(i) % 10 != 0 && maxLoss > Array.get(i) % 10){
                maxLoss = Array.get(i) % 10; 
                maxLossNum = Array.get(i);
            };
        }        
        for(int j = 0; j < Array.size(); j++ ){
            if(Array.get(j) == maxLossNum && a){
                a = false;
              	continue;
            }else{
            	int t = Array.get(j);
            	int rt = t % 10;
            	int adj = 0;
            	if(rt > 0){
            	    adj = 10 - rt;
            	}
            	amtTime += t + adj;
            }
        }
        
        	System.out.println(amtTime + maxLossNum);
    }
}