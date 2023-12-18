import java.util.*;
public class Main{
	public static void main(String[] args){
		
      	Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	
      	ArrayList<Integer> L = new ArrayList<>();
		int l = 0;
      	for(int i = 0; i < N; i++){
          	l = sc.nextInt();     
// 	        if(!L.contains(l)){
        		L.add(l);
//          }
        }
        Collections.sort(L);
      
      	int cnt = 0;
      	int li,lj,lk;
               
      	for(int i = 0; i < L.size() - 2; i++){
        	for(int j = i + 1; j < L.size() - 1; j++){
              	for(int k = j + 1; k < L.size(); k++){
                  	
            		li = L.get(i);
              		lj = L.get(j);
              		lk = L.get(k);
              		
					if(li != lj && lj != lk && li + lj > lk){ 
               			cnt++;	
              		}
                }
            }
        }
      	System.out.println(cnt);
	}
}