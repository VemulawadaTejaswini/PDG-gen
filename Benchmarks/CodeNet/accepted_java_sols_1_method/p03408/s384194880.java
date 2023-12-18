import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int n = Integer.parseInt(sc.next());
            
            HashMap<String,Integer> map = new HashMap<String,Integer>();
            
            for(int i=0; i<n; i++){
            	String s = sc.next();
            	
            	if(map.get(s) == null){
            		map.put(s, 1);
            	}else{
            		map.put(s, map.get(s)+1);
            	}
            }
            
            int m = Integer.parseInt(sc.next());
            
            for(int i=0; i<m; i++){
            	String s = sc.next();
            	
            	if(map.get(s) != null){
            		map.put(s, map.get(s)-1);
            	}
            }
            
            int max = 0;
            
            for(int val : map.values()){
            	if(val>max){
            		max = val;
            	}
    		}
            
            //出力
            System.out.println(max);
            sc.close();
        }
    }
	