import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        
        //ArrayList<Long> cd_A = new ArrayList<Long>();
        Map<Long,Integer> cd_A = new HashMap();
        for(long i=1; i*i <= A; i++){
    		if( A % i == 0){
    			cd_A.put(i,1);
    			if( i != A/i ) cd_A.put(A/i,1); 
    		}
    	}
        
        Map<Long,Integer> cd_AB = new HashMap();
        for(long i=1; i*i <= B; i++){
    		if( B % i == 0){
    		    if(cd_A.containsKey(i)) cd_AB.put(i,1);
    			if( i != B/i ){
    			    if(cd_A.containsKey(B/i)) cd_AB.put(B/i,1);
    			}
    		}
    	}
        
        Set<Long> keys_set = cd_AB.keySet();
        List<Long> keys = new ArrayList<Long>(keys_set);
        Collections.sort(keys);
        
        int ans = 0;
        for(long key : keys){
            for(long key2 : keys){
                if(key <= key2){
                    ans ++;
                    break;
                } else if(key%key2 == 0 && key2 != 1){
                    break;
                }
            }
        }
        System.out.println(ans);
        
    }
    
}
