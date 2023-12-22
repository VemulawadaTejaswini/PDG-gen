import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
		
      	int N = scan.nextInt();
      	int H[] = new int[N];
      
      	for(int i = 0; i < N; i++){
        	H[i] = scan.nextInt();  
        }
      	
     // Arrays.sort(H);
      
      int cnt = 0;
      List<Integer> cntList = new ArrayList<Integer>();
      for(int i = 0; i < N; i++){
      	for(int j = i+1; j < N; j++){
      	
          	if(H[i] >= H[j]){
             	cnt++;
              	break;
            } else {
              	cnt = 0;
             	break; 
            }
	      }	
     	cntList.add(cnt);
      }
      
     Collections.sort(cntList, Collections.reverseOrder());

      if(cntList.isEmpty()){
      	System.out.println(0);
        return;
        
      }
      System.out.println(cntList.get(0));
       	
    }
}
